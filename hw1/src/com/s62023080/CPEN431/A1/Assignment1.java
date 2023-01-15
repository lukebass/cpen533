package com.s62023080.CPEN431.A1;

import java.io.IOException;
import java.net.http.HttpTimeoutException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Assignment1 {
    public static byte[] generateCode(String studentId, Fetch fetch) throws IOException {
        byte[] request = new byte[4];
        ByteBuffer buffer = ByteBuffer.wrap(request);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        buffer.putInt(Integer.parseInt(studentId));
        return fetch.fetch(request);
    }

    public static void main(String[] args) throws IOException {
//        // Requires 3 arguments
//        if (args.length != 3) {
//            System.out.println("This requires an address, port, and student ID");
//            return;
//        }
//
        Fetch fetch = new Fetch("34.213.181.35", "43101", 100, 4);

        try {
            ByteBuffer buffer = ByteBuffer.wrap(generateCode("1381632", fetch));
            // First 4 bytes are secret code length
            buffer.order(ByteOrder.BIG_ENDIAN);
            int length = buffer.getInt();
            buffer.order(ByteOrder.LITTLE_ENDIAN);
            // Next length bytes are secret code
            byte[] code = new byte[length];
            buffer.get(code);
            System.out.println("Student ID: " + "1381632");
            System.out.println("Secret Code Length: " + length);
            System.out.println("Secret Code: " + StringUtils.byteArrayToHexString(code));
        } catch (HttpTimeoutException e) {
            System.out.println(e.getMessage());
        }

        fetch.close();
    }
}