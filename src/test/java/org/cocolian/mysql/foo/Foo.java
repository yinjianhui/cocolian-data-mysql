// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package org.cocolian.mysql.foo;

/**
 * Protobuf type {@code Foo}
 */
public  final class Foo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Foo)
    FooOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Foo.newBuilder() to construct.
  private Foo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Foo() {
    col1_ = "";
    col2_ = 0;
    col3_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Foo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            col1_ = bs;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            col2_ = input.readInt32();
            break;
          }
          case 25: {
            bitField0_ |= 0x00000004;
            col3_ = input.readDouble();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cocolian.mysql.foo.Test.internal_static_Foo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cocolian.mysql.foo.Test.internal_static_Foo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cocolian.mysql.foo.Foo.class, org.cocolian.mysql.foo.Foo.Builder.class);
  }

  private int bitField0_;
  public static final int COL1_FIELD_NUMBER = 1;
  private volatile java.lang.Object col1_;
  /**
   * <pre>
   *定义列名和数据类型，默认为字段名和字段类型。
   * </pre>
   *
   * <code>required string col1 = 1 [(.column_option) = { ... }</code>
   */
  public boolean hasCol1() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   *定义列名和数据类型，默认为字段名和字段类型。
   * </pre>
   *
   * <code>required string col1 = 1 [(.column_option) = { ... }</code>
   */
  public java.lang.String getCol1() {
    java.lang.Object ref = col1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        col1_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   *定义列名和数据类型，默认为字段名和字段类型。
   * </pre>
   *
   * <code>required string col1 = 1 [(.column_option) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getCol1Bytes() {
    java.lang.Object ref = col1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      col1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COL2_FIELD_NUMBER = 2;
  private int col2_;
  /**
   * <pre>
   *定义列名和数据类型，默认为字段名和字段类型。
   * </pre>
   *
   * <code>optional int32 col2 = 2 [(.column_option) = { ... }</code>
   */
  public boolean hasCol2() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   *定义列名和数据类型，默认为字段名和字段类型。
   * </pre>
   *
   * <code>optional int32 col2 = 2 [(.column_option) = { ... }</code>
   */
  public int getCol2() {
    return col2_;
  }

  public static final int COL3_FIELD_NUMBER = 3;
  private double col3_;
  /**
   * <pre>
   *定义列名和数据类型，默认为字段名和字段类型。
   * </pre>
   *
   * <code>optional double col3 = 3 [(.column_option) = { ... }</code>
   */
  public boolean hasCol3() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   *定义列名和数据类型，默认为字段名和字段类型。
   * </pre>
   *
   * <code>optional double col3 = 3 [(.column_option) = { ... }</code>
   */
  public double getCol3() {
    return col3_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasCol1()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, col1_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, col2_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeDouble(3, col3_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, col1_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, col2_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, col3_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.cocolian.mysql.foo.Foo)) {
      return super.equals(obj);
    }
    org.cocolian.mysql.foo.Foo other = (org.cocolian.mysql.foo.Foo) obj;

    boolean result = true;
    result = result && (hasCol1() == other.hasCol1());
    if (hasCol1()) {
      result = result && getCol1()
          .equals(other.getCol1());
    }
    result = result && (hasCol2() == other.hasCol2());
    if (hasCol2()) {
      result = result && (getCol2()
          == other.getCol2());
    }
    result = result && (hasCol3() == other.hasCol3());
    if (hasCol3()) {
      result = result && (
          java.lang.Double.doubleToLongBits(getCol3())
          == java.lang.Double.doubleToLongBits(
              other.getCol3()));
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCol1()) {
      hash = (37 * hash) + COL1_FIELD_NUMBER;
      hash = (53 * hash) + getCol1().hashCode();
    }
    if (hasCol2()) {
      hash = (37 * hash) + COL2_FIELD_NUMBER;
      hash = (53 * hash) + getCol2();
    }
    if (hasCol3()) {
      hash = (37 * hash) + COL3_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getCol3()));
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cocolian.mysql.foo.Foo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cocolian.mysql.foo.Foo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cocolian.mysql.foo.Foo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cocolian.mysql.foo.Foo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cocolian.mysql.foo.Foo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cocolian.mysql.foo.Foo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cocolian.mysql.foo.Foo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cocolian.mysql.foo.Foo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cocolian.mysql.foo.Foo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.cocolian.mysql.foo.Foo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cocolian.mysql.foo.Foo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cocolian.mysql.foo.Foo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.cocolian.mysql.foo.Foo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code Foo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Foo)
      org.cocolian.mysql.foo.FooOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cocolian.mysql.foo.Test.internal_static_Foo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cocolian.mysql.foo.Test.internal_static_Foo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cocolian.mysql.foo.Foo.class, org.cocolian.mysql.foo.Foo.Builder.class);
    }

    // Construct using org.cocolian.mysql.foo.Foo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      col1_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      col2_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      col3_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cocolian.mysql.foo.Test.internal_static_Foo_descriptor;
    }

    public org.cocolian.mysql.foo.Foo getDefaultInstanceForType() {
      return org.cocolian.mysql.foo.Foo.getDefaultInstance();
    }

    public org.cocolian.mysql.foo.Foo build() {
      org.cocolian.mysql.foo.Foo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.cocolian.mysql.foo.Foo buildPartial() {
      org.cocolian.mysql.foo.Foo result = new org.cocolian.mysql.foo.Foo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.col1_ = col1_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.col2_ = col2_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.col3_ = col3_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.cocolian.mysql.foo.Foo) {
        return mergeFrom((org.cocolian.mysql.foo.Foo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cocolian.mysql.foo.Foo other) {
      if (other == org.cocolian.mysql.foo.Foo.getDefaultInstance()) return this;
      if (other.hasCol1()) {
        bitField0_ |= 0x00000001;
        col1_ = other.col1_;
        onChanged();
      }
      if (other.hasCol2()) {
        setCol2(other.getCol2());
      }
      if (other.hasCol3()) {
        setCol3(other.getCol3());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      if (!hasCol1()) {
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.cocolian.mysql.foo.Foo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.cocolian.mysql.foo.Foo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object col1_ = "";
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>required string col1 = 1 [(.column_option) = { ... }</code>
     */
    public boolean hasCol1() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>required string col1 = 1 [(.column_option) = { ... }</code>
     */
    public java.lang.String getCol1() {
      java.lang.Object ref = col1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          col1_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>required string col1 = 1 [(.column_option) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getCol1Bytes() {
      java.lang.Object ref = col1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        col1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>required string col1 = 1 [(.column_option) = { ... }</code>
     */
    public Builder setCol1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      col1_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>required string col1 = 1 [(.column_option) = { ... }</code>
     */
    public Builder clearCol1() {
      bitField0_ = (bitField0_ & ~0x00000001);
      col1_ = getDefaultInstance().getCol1();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>required string col1 = 1 [(.column_option) = { ... }</code>
     */
    public Builder setCol1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      col1_ = value;
      onChanged();
      return this;
    }

    private int col2_ ;
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>optional int32 col2 = 2 [(.column_option) = { ... }</code>
     */
    public boolean hasCol2() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>optional int32 col2 = 2 [(.column_option) = { ... }</code>
     */
    public int getCol2() {
      return col2_;
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>optional int32 col2 = 2 [(.column_option) = { ... }</code>
     */
    public Builder setCol2(int value) {
      bitField0_ |= 0x00000002;
      col2_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>optional int32 col2 = 2 [(.column_option) = { ... }</code>
     */
    public Builder clearCol2() {
      bitField0_ = (bitField0_ & ~0x00000002);
      col2_ = 0;
      onChanged();
      return this;
    }

    private double col3_ ;
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>optional double col3 = 3 [(.column_option) = { ... }</code>
     */
    public boolean hasCol3() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>optional double col3 = 3 [(.column_option) = { ... }</code>
     */
    public double getCol3() {
      return col3_;
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>optional double col3 = 3 [(.column_option) = { ... }</code>
     */
    public Builder setCol3(double value) {
      bitField0_ |= 0x00000004;
      col3_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *定义列名和数据类型，默认为字段名和字段类型。
     * </pre>
     *
     * <code>optional double col3 = 3 [(.column_option) = { ... }</code>
     */
    public Builder clearCol3() {
      bitField0_ = (bitField0_ & ~0x00000004);
      col3_ = 0D;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Foo)
  }

  // @@protoc_insertion_point(class_scope:Foo)
  private static final org.cocolian.mysql.foo.Foo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cocolian.mysql.foo.Foo();
  }

  public static org.cocolian.mysql.foo.Foo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Foo>
      PARSER = new com.google.protobuf.AbstractParser<Foo>() {
    public Foo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Foo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Foo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Foo> getParserForType() {
    return PARSER;
  }

  public org.cocolian.mysql.foo.Foo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

