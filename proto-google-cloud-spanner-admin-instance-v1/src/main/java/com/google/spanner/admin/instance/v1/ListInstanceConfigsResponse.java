/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

/**
 *
 *
 * <pre>
 * The response for [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs].
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.instance.v1.ListInstanceConfigsResponse}
 */
public final class ListInstanceConfigsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.instance.v1.ListInstanceConfigsResponse)
    ListInstanceConfigsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListInstanceConfigsResponse.newBuilder() to construct.
  private ListInstanceConfigsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListInstanceConfigsResponse() {
    instanceConfigs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListInstanceConfigsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListInstanceConfigsResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                instanceConfigs_ =
                    new java.util.ArrayList<com.google.spanner.admin.instance.v1.InstanceConfig>();
                mutable_bitField0_ |= 0x00000001;
              }
              instanceConfigs_.add(
                  input.readMessage(
                      com.google.spanner.admin.instance.v1.InstanceConfig.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        instanceConfigs_ = java.util.Collections.unmodifiableList(instanceConfigs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto
        .internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto
        .internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse.class,
            com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse.Builder.class);
  }

  public static final int INSTANCE_CONFIGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.spanner.admin.instance.v1.InstanceConfig> instanceConfigs_;
  /**
   *
   *
   * <pre>
   * The list of requested instance configurations.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.spanner.admin.instance.v1.InstanceConfig>
      getInstanceConfigsList() {
    return instanceConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The list of requested instance configurations.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder>
      getInstanceConfigsOrBuilderList() {
    return instanceConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The list of requested instance configurations.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
   */
  @java.lang.Override
  public int getInstanceConfigsCount() {
    return instanceConfigs_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of requested instance configurations.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.admin.instance.v1.InstanceConfig getInstanceConfigs(int index) {
    return instanceConfigs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of requested instance configurations.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder getInstanceConfigsOrBuilder(
      int index) {
    return instanceConfigs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs] call to
   * fetch more of the matching instance configurations.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs] call to
   * fetch more of the matching instance configurations.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < instanceConfigs_.size(); i++) {
      output.writeMessage(1, instanceConfigs_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < instanceConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, instanceConfigs_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse other =
        (com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse) obj;

    if (!getInstanceConfigsList().equals(other.getInstanceConfigsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getInstanceConfigsCount() > 0) {
      hash = (37 * hash) + INSTANCE_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getInstanceConfigsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response for [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs].
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.instance.v1.ListInstanceConfigsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.instance.v1.ListInstanceConfigsResponse)
      com.google.spanner.admin.instance.v1.ListInstanceConfigsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto
          .internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto
          .internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse.class,
              com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse.Builder.class);
    }

    // Construct using com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getInstanceConfigsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (instanceConfigsBuilder_ == null) {
        instanceConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        instanceConfigsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto
          .internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse
        getDefaultInstanceForType() {
      return com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse build() {
      com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse buildPartial() {
      com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse result =
          new com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse(this);
      int from_bitField0_ = bitField0_;
      if (instanceConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          instanceConfigs_ = java.util.Collections.unmodifiableList(instanceConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.instanceConfigs_ = instanceConfigs_;
      } else {
        result.instanceConfigs_ = instanceConfigsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse) {
        return mergeFrom((com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse other) {
      if (other
          == com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse.getDefaultInstance())
        return this;
      if (instanceConfigsBuilder_ == null) {
        if (!other.instanceConfigs_.isEmpty()) {
          if (instanceConfigs_.isEmpty()) {
            instanceConfigs_ = other.instanceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInstanceConfigsIsMutable();
            instanceConfigs_.addAll(other.instanceConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.instanceConfigs_.isEmpty()) {
          if (instanceConfigsBuilder_.isEmpty()) {
            instanceConfigsBuilder_.dispose();
            instanceConfigsBuilder_ = null;
            instanceConfigs_ = other.instanceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            instanceConfigsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getInstanceConfigsFieldBuilder()
                    : null;
          } else {
            instanceConfigsBuilder_.addAllMessages(other.instanceConfigs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.spanner.admin.instance.v1.InstanceConfig> instanceConfigs_ =
        java.util.Collections.emptyList();

    private void ensureInstanceConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        instanceConfigs_ =
            new java.util.ArrayList<com.google.spanner.admin.instance.v1.InstanceConfig>(
                instanceConfigs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.spanner.admin.instance.v1.InstanceConfig,
            com.google.spanner.admin.instance.v1.InstanceConfig.Builder,
            com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder>
        instanceConfigsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public java.util.List<com.google.spanner.admin.instance.v1.InstanceConfig>
        getInstanceConfigsList() {
      if (instanceConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instanceConfigs_);
      } else {
        return instanceConfigsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public int getInstanceConfigsCount() {
      if (instanceConfigsBuilder_ == null) {
        return instanceConfigs_.size();
      } else {
        return instanceConfigsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public com.google.spanner.admin.instance.v1.InstanceConfig getInstanceConfigs(int index) {
      if (instanceConfigsBuilder_ == null) {
        return instanceConfigs_.get(index);
      } else {
        return instanceConfigsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public Builder setInstanceConfigs(
        int index, com.google.spanner.admin.instance.v1.InstanceConfig value) {
      if (instanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstanceConfigsIsMutable();
        instanceConfigs_.set(index, value);
        onChanged();
      } else {
        instanceConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public Builder setInstanceConfigs(
        int index, com.google.spanner.admin.instance.v1.InstanceConfig.Builder builderForValue) {
      if (instanceConfigsBuilder_ == null) {
        ensureInstanceConfigsIsMutable();
        instanceConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        instanceConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public Builder addInstanceConfigs(com.google.spanner.admin.instance.v1.InstanceConfig value) {
      if (instanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstanceConfigsIsMutable();
        instanceConfigs_.add(value);
        onChanged();
      } else {
        instanceConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public Builder addInstanceConfigs(
        int index, com.google.spanner.admin.instance.v1.InstanceConfig value) {
      if (instanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstanceConfigsIsMutable();
        instanceConfigs_.add(index, value);
        onChanged();
      } else {
        instanceConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public Builder addInstanceConfigs(
        com.google.spanner.admin.instance.v1.InstanceConfig.Builder builderForValue) {
      if (instanceConfigsBuilder_ == null) {
        ensureInstanceConfigsIsMutable();
        instanceConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        instanceConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public Builder addInstanceConfigs(
        int index, com.google.spanner.admin.instance.v1.InstanceConfig.Builder builderForValue) {
      if (instanceConfigsBuilder_ == null) {
        ensureInstanceConfigsIsMutable();
        instanceConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        instanceConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public Builder addAllInstanceConfigs(
        java.lang.Iterable<? extends com.google.spanner.admin.instance.v1.InstanceConfig> values) {
      if (instanceConfigsBuilder_ == null) {
        ensureInstanceConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, instanceConfigs_);
        onChanged();
      } else {
        instanceConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public Builder clearInstanceConfigs() {
      if (instanceConfigsBuilder_ == null) {
        instanceConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        instanceConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public Builder removeInstanceConfigs(int index) {
      if (instanceConfigsBuilder_ == null) {
        ensureInstanceConfigsIsMutable();
        instanceConfigs_.remove(index);
        onChanged();
      } else {
        instanceConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public com.google.spanner.admin.instance.v1.InstanceConfig.Builder getInstanceConfigsBuilder(
        int index) {
      return getInstanceConfigsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder getInstanceConfigsOrBuilder(
        int index) {
      if (instanceConfigsBuilder_ == null) {
        return instanceConfigs_.get(index);
      } else {
        return instanceConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public java.util.List<? extends com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder>
        getInstanceConfigsOrBuilderList() {
      if (instanceConfigsBuilder_ != null) {
        return instanceConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instanceConfigs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public com.google.spanner.admin.instance.v1.InstanceConfig.Builder addInstanceConfigsBuilder() {
      return getInstanceConfigsFieldBuilder()
          .addBuilder(com.google.spanner.admin.instance.v1.InstanceConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public com.google.spanner.admin.instance.v1.InstanceConfig.Builder addInstanceConfigsBuilder(
        int index) {
      return getInstanceConfigsFieldBuilder()
          .addBuilder(
              index, com.google.spanner.admin.instance.v1.InstanceConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of requested instance configurations.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig instance_configs = 1;</code>
     */
    public java.util.List<com.google.spanner.admin.instance.v1.InstanceConfig.Builder>
        getInstanceConfigsBuilderList() {
      return getInstanceConfigsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.spanner.admin.instance.v1.InstanceConfig,
            com.google.spanner.admin.instance.v1.InstanceConfig.Builder,
            com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder>
        getInstanceConfigsFieldBuilder() {
      if (instanceConfigsBuilder_ == null) {
        instanceConfigsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.spanner.admin.instance.v1.InstanceConfig,
                com.google.spanner.admin.instance.v1.InstanceConfig.Builder,
                com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder>(
                instanceConfigs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        instanceConfigs_ = null;
      }
      return instanceConfigsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs] call to
     * fetch more of the matching instance configurations.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs] call to
     * fetch more of the matching instance configurations.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs] call to
     * fetch more of the matching instance configurations.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs] call to
     * fetch more of the matching instance configurations.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs] call to
     * fetch more of the matching instance configurations.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.instance.v1.ListInstanceConfigsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.instance.v1.ListInstanceConfigsResponse)
  private static final com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse();
  }

  public static com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInstanceConfigsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListInstanceConfigsResponse>() {
        @java.lang.Override
        public ListInstanceConfigsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListInstanceConfigsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListInstanceConfigsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInstanceConfigsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
