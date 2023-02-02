package com.s62023080.CPEN431.A4;

import ca.NetSysLab.ProtocolBuffers.Message.Msg;
import com.google.protobuf.ByteString;
import java.net.*;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Random;

public class Fetch {
    private final DatagramSocket socket;

    private final int timeout;

    private final int retries;

    public Fetch(String host, String port, int timeout, int retries) throws SocketException, UnknownHostException {
        socket = new DatagramSocket();
        socket.connect(InetAddress.getByName(host), Integer.parseInt(port));
        this.timeout = timeout;
        socket.setSoTimeout(timeout);
        this.retries = retries;
    }

    public void close() {
        socket.close();
    }

    public void reset() throws SocketException {
        socket.setSoTimeout(this.timeout);
    }

    public void setTimeout(int timeout) throws SocketException {
        socket.setSoTimeout(timeout);
    }

    public byte[] createMessageID() {
        byte[] messageID = new byte[16];
        ByteBuffer buffer = ByteBuffer.wrap(messageID);
        // First 4 bytes are client IP
        buffer.put(socket.getLocalAddress().getAddress());
        // Next 2 bytes are client port
        buffer.putShort((short) socket.getLocalPort());
        // Next 2 bytes are random
        byte[] random = new byte[2];
        new Random().nextBytes(random);
        buffer.put(random);
        // Next 8 bytes are time
        buffer.putLong(System.nanoTime());
        return messageID;
    }

    public byte[] sendReceive(byte[] request) throws IOException {
        DatagramPacket requestPacket = new DatagramPacket(request, request.length);
        socket.send(requestPacket);
        DatagramPacket responsePacket = new DatagramPacket(new byte[16000], 16000);
        socket.receive(responsePacket);
        ByteBuffer buffer = ByteBuffer.wrap(responsePacket.getData());
        byte[] response = new byte[responsePacket.getLength()];
        buffer.get(response);
        return response;
    }

    public byte[] fetch(byte[] payload) throws IOException {
        byte[] messageID = createMessageID();
        Msg.Builder reqMsg = Msg.newBuilder();
        reqMsg.setMessageID(ByteString.copyFrom(messageID));
        reqMsg.setPayload(ByteString.copyFrom(payload));
        reqMsg.setCheckSum(Utils.createCheckSum(messageID, payload));

        byte[] formattedResponse = null;
        int retries = this.retries;
        while (retries > 0) {
            try {
                Msg resMsg = Msg.parseFrom(sendReceive(reqMsg.build().toByteArray()));

                // Ensure request and response IDs match
                if (!reqMsg.getMessageID().equals(resMsg.getMessageID())) {
                    throw new IOException("Mismatched request and response IDs");
                }

                // Ensure checksum is valid
                if (resMsg.getCheckSum() != Utils.createCheckSum(resMsg.getMessageID().toByteArray(), resMsg.getPayload().toByteArray())) {
                    throw new IOException("Checksum invalid, message potentially corrupted");
                }

                formattedResponse = resMsg.getPayload().toByteArray();

                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                setTimeout(socket.getSoTimeout() * 2);
                retries -= 1;
            }
        }

        reset();

        if (formattedResponse == null) {
            throw new IOException("Request Failed");
        }

        return formattedResponse;
    }
}