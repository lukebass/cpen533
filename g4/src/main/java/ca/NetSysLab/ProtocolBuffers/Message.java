// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Message.proto

package ca.NetSysLab.ProtocolBuffers;

public final class Message {
  private Message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Msg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes messageID = 1;</code>
     * @return The messageID.
     */
    com.google.protobuf.ByteString getMessageID();

    /**
     * <code>bytes payload = 2;</code>
     * @return The payload.
     */
    com.google.protobuf.ByteString getPayload();

    /**
     * <code>fixed64 checkSum = 3;</code>
     * @return The checkSum.
     */
    long getCheckSum();

    /**
     * <code>optional bytes address = 4;</code>
     * @return Whether the address field is set.
     */
    boolean hasAddress();
    /**
     * <code>optional bytes address = 4;</code>
     * @return The address.
     */
    com.google.protobuf.ByteString getAddress();

    /**
     * <code>optional int32 port = 5;</code>
     * @return Whether the port field is set.
     */
    boolean hasPort();
    /**
     * <code>optional int32 port = 5;</code>
     * @return The port.
     */
    int getPort();
  }
  /**
   * Protobuf type {@code Msg}
   */
  public static final class Msg extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Msg)
      MsgOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Msg.newBuilder() to construct.
    private Msg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Msg() {
      messageID_ = com.google.protobuf.ByteString.EMPTY;
      payload_ = com.google.protobuf.ByteString.EMPTY;
      address_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Msg();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ca.NetSysLab.ProtocolBuffers.Message.internal_static_Msg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ca.NetSysLab.ProtocolBuffers.Message.internal_static_Msg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ca.NetSysLab.ProtocolBuffers.Message.Msg.class, ca.NetSysLab.ProtocolBuffers.Message.Msg.Builder.class);
    }

    private int bitField0_;
    public static final int MESSAGEID_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString messageID_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes messageID = 1;</code>
     * @return The messageID.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMessageID() {
      return messageID_;
    }

    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 2;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }

    public static final int CHECKSUM_FIELD_NUMBER = 3;
    private long checkSum_ = 0L;
    /**
     * <code>fixed64 checkSum = 3;</code>
     * @return The checkSum.
     */
    @java.lang.Override
    public long getCheckSum() {
      return checkSum_;
    }

    public static final int ADDRESS_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString address_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes address = 4;</code>
     * @return Whether the address field is set.
     */
    @java.lang.Override
    public boolean hasAddress() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bytes address = 4;</code>
     * @return The address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAddress() {
      return address_;
    }

    public static final int PORT_FIELD_NUMBER = 5;
    private int port_ = 0;
    /**
     * <code>optional int32 port = 5;</code>
     * @return Whether the port field is set.
     */
    @java.lang.Override
    public boolean hasPort() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 port = 5;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!messageID_.isEmpty()) {
        output.writeBytes(1, messageID_);
      }
      if (!payload_.isEmpty()) {
        output.writeBytes(2, payload_);
      }
      if (checkSum_ != 0L) {
        output.writeFixed64(3, checkSum_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBytes(4, address_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(5, port_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!messageID_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, messageID_);
      }
      if (!payload_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, payload_);
      }
      if (checkSum_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(3, checkSum_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, address_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, port_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ca.NetSysLab.ProtocolBuffers.Message.Msg)) {
        return super.equals(obj);
      }
      ca.NetSysLab.ProtocolBuffers.Message.Msg other = (ca.NetSysLab.ProtocolBuffers.Message.Msg) obj;

      if (!getMessageID()
          .equals(other.getMessageID())) return false;
      if (!getPayload()
          .equals(other.getPayload())) return false;
      if (getCheckSum()
          != other.getCheckSum()) return false;
      if (hasAddress() != other.hasAddress()) return false;
      if (hasAddress()) {
        if (!getAddress()
            .equals(other.getAddress())) return false;
      }
      if (hasPort() != other.hasPort()) return false;
      if (hasPort()) {
        if (getPort()
            != other.getPort()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MESSAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getMessageID().hashCode();
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
      hash = (37 * hash) + CHECKSUM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCheckSum());
      if (hasAddress()) {
        hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
        hash = (53 * hash) + getAddress().hashCode();
      }
      if (hasPort()) {
        hash = (37 * hash) + PORT_FIELD_NUMBER;
        hash = (53 * hash) + getPort();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ca.NetSysLab.ProtocolBuffers.Message.Msg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ca.NetSysLab.ProtocolBuffers.Message.Msg prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Msg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Msg)
        ca.NetSysLab.ProtocolBuffers.Message.MsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ca.NetSysLab.ProtocolBuffers.Message.internal_static_Msg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ca.NetSysLab.ProtocolBuffers.Message.internal_static_Msg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ca.NetSysLab.ProtocolBuffers.Message.Msg.class, ca.NetSysLab.ProtocolBuffers.Message.Msg.Builder.class);
      }

      // Construct using ca.NetSysLab.ProtocolBuffers.Message.Msg.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        messageID_ = com.google.protobuf.ByteString.EMPTY;
        payload_ = com.google.protobuf.ByteString.EMPTY;
        checkSum_ = 0L;
        address_ = com.google.protobuf.ByteString.EMPTY;
        port_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ca.NetSysLab.ProtocolBuffers.Message.internal_static_Msg_descriptor;
      }

      @java.lang.Override
      public ca.NetSysLab.ProtocolBuffers.Message.Msg getDefaultInstanceForType() {
        return ca.NetSysLab.ProtocolBuffers.Message.Msg.getDefaultInstance();
      }

      @java.lang.Override
      public ca.NetSysLab.ProtocolBuffers.Message.Msg build() {
        ca.NetSysLab.ProtocolBuffers.Message.Msg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ca.NetSysLab.ProtocolBuffers.Message.Msg buildPartial() {
        ca.NetSysLab.ProtocolBuffers.Message.Msg result = new ca.NetSysLab.ProtocolBuffers.Message.Msg(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ca.NetSysLab.ProtocolBuffers.Message.Msg result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.messageID_ = messageID_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.payload_ = payload_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.checkSum_ = checkSum_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.address_ = address_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.port_ = port_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ca.NetSysLab.ProtocolBuffers.Message.Msg) {
          return mergeFrom((ca.NetSysLab.ProtocolBuffers.Message.Msg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ca.NetSysLab.ProtocolBuffers.Message.Msg other) {
        if (other == ca.NetSysLab.ProtocolBuffers.Message.Msg.getDefaultInstance()) return this;
        if (other.getMessageID() != com.google.protobuf.ByteString.EMPTY) {
          setMessageID(other.getMessageID());
        }
        if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
          setPayload(other.getPayload());
        }
        if (other.getCheckSum() != 0L) {
          setCheckSum(other.getCheckSum());
        }
        if (other.hasAddress()) {
          setAddress(other.getAddress());
        }
        if (other.hasPort()) {
          setPort(other.getPort());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                messageID_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                payload_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 25: {
                checkSum_ = input.readFixed64();
                bitField0_ |= 0x00000004;
                break;
              } // case 25
              case 34: {
                address_ = input.readBytes();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 40: {
                port_ = input.readInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString messageID_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes messageID = 1;</code>
       * @return The messageID.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMessageID() {
        return messageID_;
      }
      /**
       * <code>bytes messageID = 1;</code>
       * @param value The messageID to set.
       * @return This builder for chaining.
       */
      public Builder setMessageID(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        messageID_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes messageID = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessageID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        messageID_ = getDefaultInstance().getMessageID();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes payload = 2;</code>
       * @return The payload.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getPayload() {
        return payload_;
      }
      /**
       * <code>bytes payload = 2;</code>
       * @param value The payload to set.
       * @return This builder for chaining.
       */
      public Builder setPayload(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        payload_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bytes payload = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPayload() {
        bitField0_ = (bitField0_ & ~0x00000002);
        payload_ = getDefaultInstance().getPayload();
        onChanged();
        return this;
      }

      private long checkSum_ ;
      /**
       * <code>fixed64 checkSum = 3;</code>
       * @return The checkSum.
       */
      @java.lang.Override
      public long getCheckSum() {
        return checkSum_;
      }
      /**
       * <code>fixed64 checkSum = 3;</code>
       * @param value The checkSum to set.
       * @return This builder for chaining.
       */
      public Builder setCheckSum(long value) {
        
        checkSum_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>fixed64 checkSum = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCheckSum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        checkSum_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString address_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes address = 4;</code>
       * @return Whether the address field is set.
       */
      @java.lang.Override
      public boolean hasAddress() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional bytes address = 4;</code>
       * @return The address.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getAddress() {
        return address_;
      }
      /**
       * <code>optional bytes address = 4;</code>
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        address_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes address = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {
        bitField0_ = (bitField0_ & ~0x00000008);
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <code>optional int32 port = 5;</code>
       * @return Whether the port field is set.
       */
      @java.lang.Override
      public boolean hasPort() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional int32 port = 5;</code>
       * @return The port.
       */
      @java.lang.Override
      public int getPort() {
        return port_;
      }
      /**
       * <code>optional int32 port = 5;</code>
       * @param value The port to set.
       * @return This builder for chaining.
       */
      public Builder setPort(int value) {
        
        port_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 port = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearPort() {
        bitField0_ = (bitField0_ & ~0x00000010);
        port_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Msg)
    }

    // @@protoc_insertion_point(class_scope:Msg)
    private static final ca.NetSysLab.ProtocolBuffers.Message.Msg DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ca.NetSysLab.ProtocolBuffers.Message.Msg();
    }

    public static ca.NetSysLab.ProtocolBuffers.Message.Msg getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Msg>
        PARSER = new com.google.protobuf.AbstractParser<Msg>() {
      @java.lang.Override
      public Msg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Msg> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Msg> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ca.NetSysLab.ProtocolBuffers.Message.Msg getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Msg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Msg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rMessage.proto\"y\n\003Msg\022\021\n\tmessageID\030\001 \001(" +
      "\014\022\017\n\007payload\030\002 \001(\014\022\020\n\010checkSum\030\003 \001(\006\022\024\n\007" +
      "address\030\004 \001(\014H\000\210\001\001\022\021\n\004port\030\005 \001(\005H\001\210\001\001B\n\n" +
      "\010_addressB\007\n\005_portB\'\n\034ca.NetSysLab.Proto" +
      "colBuffersB\007Messageb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Msg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Msg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Msg_descriptor,
        new java.lang.String[] { "MessageID", "Payload", "CheckSum", "Address", "Port", "Address", "Port", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
