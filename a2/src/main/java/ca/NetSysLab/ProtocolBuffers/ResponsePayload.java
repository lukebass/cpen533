// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResponsePayload.proto

package ca.NetSysLab.ProtocolBuffers;

public final class ResponsePayload {
  private ResponsePayload() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResPayloadOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResPayload)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes secretKey = 1;</code>
     * @return The secretKey.
     */
    com.google.protobuf.ByteString getSecretKey();
  }
  /**
   * Protobuf type {@code ResPayload}
   */
  public static final class ResPayload extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResPayload)
      ResPayloadOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResPayload.newBuilder() to construct.
    private ResPayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResPayload() {
      secretKey_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ResPayload();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ca.NetSysLab.ProtocolBuffers.ResponsePayload.internal_static_ResPayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ca.NetSysLab.ProtocolBuffers.ResponsePayload.internal_static_ResPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload.class, ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload.Builder.class);
    }

    public static final int SECRETKEY_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString secretKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes secretKey = 1;</code>
     * @return The secretKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSecretKey() {
      return secretKey_;
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
      if (!secretKey_.isEmpty()) {
        output.writeBytes(1, secretKey_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!secretKey_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, secretKey_);
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
      if (!(obj instanceof ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload)) {
        return super.equals(obj);
      }
      ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload other = (ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload) obj;

      if (!getSecretKey()
          .equals(other.getSecretKey())) return false;
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
      hash = (37 * hash) + SECRETKEY_FIELD_NUMBER;
      hash = (53 * hash) + getSecretKey().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload parseFrom(
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
    public static Builder newBuilder(ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload prototype) {
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
     * Protobuf type {@code ResPayload}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResPayload)
        ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayloadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ca.NetSysLab.ProtocolBuffers.ResponsePayload.internal_static_ResPayload_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ca.NetSysLab.ProtocolBuffers.ResponsePayload.internal_static_ResPayload_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload.class, ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload.Builder.class);
      }

      // Construct using ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload.newBuilder()
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
        secretKey_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ca.NetSysLab.ProtocolBuffers.ResponsePayload.internal_static_ResPayload_descriptor;
      }

      @java.lang.Override
      public ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload getDefaultInstanceForType() {
        return ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload.getDefaultInstance();
      }

      @java.lang.Override
      public ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload build() {
        ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload buildPartial() {
        ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload result = new ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.secretKey_ = secretKey_;
        }
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
        if (other instanceof ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload) {
          return mergeFrom((ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload other) {
        if (other == ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload.getDefaultInstance()) return this;
        if (other.getSecretKey() != com.google.protobuf.ByteString.EMPTY) {
          setSecretKey(other.getSecretKey());
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
                secretKey_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

      private com.google.protobuf.ByteString secretKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes secretKey = 1;</code>
       * @return The secretKey.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getSecretKey() {
        return secretKey_;
      }
      /**
       * <code>bytes secretKey = 1;</code>
       * @param value The secretKey to set.
       * @return This builder for chaining.
       */
      public Builder setSecretKey(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        secretKey_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes secretKey = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSecretKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        secretKey_ = getDefaultInstance().getSecretKey();
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


      // @@protoc_insertion_point(builder_scope:ResPayload)
    }

    // @@protoc_insertion_point(class_scope:ResPayload)
    private static final ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload();
    }

    public static ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResPayload>
        PARSER = new com.google.protobuf.AbstractParser<ResPayload>() {
      @java.lang.Override
      public ResPayload parsePartialFrom(
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

    public static com.google.protobuf.Parser<ResPayload> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResPayload> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ca.NetSysLab.ProtocolBuffers.ResponsePayload.ResPayload getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResPayload_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ResponsePayload.proto\"\037\n\nResPayload\022\021\n" +
      "\tsecretKey\030\001 \001(\014B/\n\034ca.NetSysLab.Protoco" +
      "lBuffersB\017ResponsePayloadb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ResPayload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResPayload_descriptor,
        new java.lang.String[] { "SecretKey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
