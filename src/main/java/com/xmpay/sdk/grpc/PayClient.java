package com.xmpay.sdk.grpc;

import com.google.protobuf.*;
import lombok.Getter;

public final class PayClient {
    private PayClient() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface pay_rpc_respOrBuilder extends MessageOrBuilder {

        /**
         * <code>int32 code = 1;</code>
         *
         * @return The code.
         */
        int getCode();

        /**
         * <code>string message = 2;</code>
         *
         * @return The message.
         */
        String getMessage();

        /**
         * <code>string message = 2;</code>
         *
         * @return The bytes for message.
         */
        ByteString
        getMessageBytes();

        /**
         * <code>string data = 3;</code>
         *
         * @return The data.
         */
        String getData();

        /**
         * <code>string data = 3;</code>
         *
         * @return The bytes for data.
         */
        ByteString
        getDataBytes();
    }

    /**
     * Protobuf type {@code pay_rpc_resp}
     */
    public static final class pay_rpc_resp extends GeneratedMessageV3 implements pay_rpc_respOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use pay_rpc_resp.newBuilder() to construct.
        private pay_rpc_resp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private pay_rpc_resp() {
            message_ = "";
            data_ = "";
        }

        @Override
        @SuppressWarnings({"unused"})
        protected Object newInstance(UnusedPrivateParameter unused) {
            return new pay_rpc_resp();
        }

        @Override
        public UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private pay_rpc_resp(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            code_ = input.readInt32();
                            break;
                        }
                        case 18: {

                            message_ = input.readStringRequireUtf8();
                            break;
                        }
                        case 26: {

                            data_ = input.readStringRequireUtf8();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return PayClient.internal_static_com_xmpay_sdk_agrpc_pay_rpc_resp_descriptor;
        }

        @Override
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PayClient.internal_static_com_xmpay_sdk_agrpc_pay_rpc_resp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(PayClient.pay_rpc_resp.class, PayClient.pay_rpc_resp.Builder.class);
        }

        public static final int CODE_FIELD_NUMBER = 1;
        private int code_;

        /**
         * <code>int32 code = 1;</code>
         *
         * @return The code.
         */
        @Override
        public int getCode() {
            return code_;
        }

        public static final int MESSAGE_FIELD_NUMBER = 2;
        private volatile Object message_;

        /**
         * <code>string message = 2;</code>
         *
         * @return The message.
         */
        @Override
        public String getMessage() {
            Object ref = message_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                message_ = s;
                return s;
            }
        }

        /**
         * <code>string message = 2;</code>
         *
         * @return The bytes for message.
         */
        @Override
        public ByteString getMessageBytes() {
            Object ref = message_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                message_ = b;
                return b;
            } else {
                return (ByteString) ref;
            }
        }

        public static final int DATA_FIELD_NUMBER = 3;
        private volatile Object data_;

        /**
         * <code>string data = 3;</code>
         *
         * @return The data.
         */
        @Override
        public String getData() {
            Object ref = data_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                data_ = s;
                return s;
            }
        }

        /**
         * <code>string data = 3;</code>
         *
         * @return The bytes for data.
         */
        @Override
        public ByteString getDataBytes() {
            Object ref = data_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                data_ = b;
                return b;
            } else {
                return (ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;

        @Override
        public boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (code_ != 0) {
                output.writeInt32(1, code_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
                GeneratedMessageV3.writeString(output, 2, message_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(data_)) {
                GeneratedMessageV3.writeString(output, 3, data_);
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (code_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, code_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
                size += GeneratedMessageV3.computeStringSize(2, message_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(data_)) {
                size += GeneratedMessageV3.computeStringSize(3, data_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PayClient.pay_rpc_resp)) {
                return super.equals(obj);
            }
            PayClient.pay_rpc_resp other = (PayClient.pay_rpc_resp) obj;

            if (getCode() != other.getCode()) return false;
            if (!getMessage().equals(other.getMessage())) return false;
            if (!getData().equals(other.getData())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + CODE_FIELD_NUMBER;
            hash = (53 * hash) + getCode();
            hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
            hash = (53 * hash) + getMessage().hashCode();
            hash = (37 * hash) + DATA_FIELD_NUMBER;
            hash = (53 * hash) + getData().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static PayClient.pay_rpc_resp parseFrom(java.nio.ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PayClient.pay_rpc_resp parseFrom(java.nio.ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PayClient.pay_rpc_resp parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PayClient.pay_rpc_resp parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PayClient.pay_rpc_resp parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PayClient.pay_rpc_resp parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PayClient.pay_rpc_resp parseFrom(java.io.InputStream input) throws java.io.IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PayClient.pay_rpc_resp parseFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static PayClient.pay_rpc_resp parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static PayClient.pay_rpc_resp parseDelimitedFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static PayClient.pay_rpc_resp parseFrom(CodedInputStream input) throws java.io.IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PayClient.pay_rpc_resp parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(PayClient.pay_rpc_resp prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            return new Builder(parent);
        }

        /**
         * Protobuf type {@code pay_rpc_resp}
         */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PayClient.pay_rpc_respOrBuilder {
            public static Descriptors.Descriptor getDescriptor() {
                return PayClient.internal_static_com_xmpay_sdk_agrpc_pay_rpc_resp_descriptor;
            }

            @Override
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PayClient.internal_static_com_xmpay_sdk_agrpc_pay_rpc_resp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(PayClient.pay_rpc_resp.class, PayClient.pay_rpc_resp.Builder.class);
            }

            // Construct using PayClient.pay_rpc_resp.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            @Override
            public Builder clear() {
                super.clear();
                code_ = 0;

                message_ = "";

                data_ = "";

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PayClient.internal_static_com_xmpay_sdk_agrpc_pay_rpc_resp_descriptor;
            }

            @Override
            public PayClient.pay_rpc_resp getDefaultInstanceForType() {
                return PayClient.pay_rpc_resp.getDefaultInstance();
            }

            @Override
            public PayClient.pay_rpc_resp build() {
                PayClient.pay_rpc_resp result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public PayClient.pay_rpc_resp buildPartial() {
                PayClient.pay_rpc_resp result = new PayClient.pay_rpc_resp(this);
                result.code_ = code_;
                result.message_ = message_;
                result.data_ = data_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return super.clone();
            }

            @Override
            public Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return super.setField(field, value);
            }

            @Override
            public Builder clearField(Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @Override
            public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof PayClient.pay_rpc_resp) {
                    return mergeFrom((PayClient.pay_rpc_resp) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(PayClient.pay_rpc_resp other) {
                if (other == PayClient.pay_rpc_resp.getDefaultInstance()) return this;
                if (other.getCode() != 0) {
                    setCode(other.getCode());
                }
                if (!other.getMessage().isEmpty()) {
                    message_ = other.message_;
                    onChanged();
                }
                if (!other.getData().isEmpty()) {
                    data_ = other.data_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override
            public boolean isInitialized() {
                return true;
            }

            @Override
            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                PayClient.pay_rpc_resp parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (PayClient.pay_rpc_resp) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int code_;

            /**
             * <code>int32 code = 1;</code>
             *
             * @return The code.
             */
            @Override
            public int getCode() {
                return code_;
            }

            /**
             * <code>int32 code = 1;</code>
             *
             * @param value The code to set.
             * @return This builder for chaining.
             */
            public Builder setCode(int value) {

                code_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 code = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCode() {

                code_ = 0;
                onChanged();
                return this;
            }

            private Object message_ = "";

            /**
             * <code>string message = 2;</code>
             *
             * @return The message.
             */
            public String getMessage() {
                Object ref = message_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    message_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string message = 2;</code>
             *
             * @return The bytes for message.
             */
            public ByteString getMessageBytes() {
                Object ref = message_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    message_ = b;
                    return b;
                } else {
                    return (ByteString) ref;
                }
            }

            /**
             * <code>string message = 2;</code>
             *
             * @param value The message to set.
             * @return This builder for chaining.
             */
            public Builder setMessage(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                message_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string message = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMessage() {

                message_ = getDefaultInstance().getMessage();
                onChanged();
                return this;
            }

            /**
             * <code>string message = 2;</code>
             *
             * @param value The bytes for message to set.
             * @return This builder for chaining.
             */
            public Builder setMessageBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                message_ = value;
                onChanged();
                return this;
            }

            private Object data_ = "";

            /**
             * <code>string data = 3;</code>
             *
             * @return The data.
             */
            public String getData() {
                Object ref = data_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    data_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string data = 3;</code>
             *
             * @return The bytes for data.
             */
            public ByteString getDataBytes() {
                Object ref = data_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    data_ = b;
                    return b;
                } else {
                    return (ByteString) ref;
                }
            }

            /**
             * <code>string data = 3;</code>
             *
             * @param value The data to set.
             * @return This builder for chaining.
             */
            public Builder setData(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                data_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string data = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearData() {
                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }

            /**
             * <code>string data = 3;</code>
             *
             * @param value The bytes for data to set.
             * @return This builder for chaining.
             */
            public Builder setDataBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                data_ = value;
                onChanged();
                return this;
            }

            @Override
            public Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @Override
            public Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:pay_rpc_resp)
        }

        // @@protoc_insertion_point(class_scope:pay_rpc_resp)
        private static final PayClient.pay_rpc_resp DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new PayClient.pay_rpc_resp();
        }

        public static PayClient.pay_rpc_resp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final Parser<pay_rpc_resp> PARSER = new AbstractParser<pay_rpc_resp>() {
            @Override
            public pay_rpc_resp parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new pay_rpc_resp(input, extensionRegistry);
            }
        };

        public static Parser<pay_rpc_resp> parser() {
            return PARSER;
        }

        @Override
        public Parser<pay_rpc_resp> getParserForType() {
            return PARSER;
        }

        @Override
        public PayClient.pay_rpc_resp getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface pay_rpc_paramOrBuilder extends MessageOrBuilder {

        /**
         * <code>string app_key = 1;</code>
         *
         * @return The appKey.
         */
        String getAppKey();

        /**
         * <code>string app_key = 1;</code>
         *
         * @return The bytes for appKey.
         */
        ByteString
        getAppKeyBytes();

        /**
         * <code>string data = 2;</code>
         *
         * @return The data.
         */
        String getData();

        /**
         * <code>string data = 2;</code>
         *
         * @return The bytes for data.
         */
        ByteString
        getDataBytes();
    }

    /**
     * Protobuf type {@code pay_rpc_param}
     */
    public static final class pay_rpc_param extends GeneratedMessageV3 implements pay_rpc_paramOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use pay_rpc_param.newBuilder() to construct.
        private pay_rpc_param(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private pay_rpc_param() {
            appKey_ = "";
            data_ = "";
        }

        @Override
        @SuppressWarnings({"unused"})
        protected Object newInstance(UnusedPrivateParameter unused) {
            return new pay_rpc_param();
        }

        @Override
        public UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private pay_rpc_param(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {

                            appKey_ = input.readStringRequireUtf8();
                            break;
                        }
                        case 18: {

                            data_ = input.readStringRequireUtf8();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static Descriptors.Descriptor getDescriptor() {
            return PayClient.internal_static_com_xmpay_sdk_agrpc_pay_rpc_param_descriptor;
        }

        @Override
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PayClient.internal_static_com_xmpay_sdk_agrpc_pay_rpc_param_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            PayClient.pay_rpc_param.class, PayClient.pay_rpc_param.Builder.class);
        }

        public static final int APP_KEY_FIELD_NUMBER = 1;
        private volatile Object appKey_;

        /**
         * <code>string app_key = 1;</code>
         *
         * @return The appKey.
         */
        @Override
        public String getAppKey() {
            Object ref = appKey_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                appKey_ = s;
                return s;
            }
        }

        /**
         * <code>string app_key = 1;</code>
         *
         * @return The bytes for appKey.
         */
        @Override
        public ByteString getAppKeyBytes() {
            Object ref = appKey_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                appKey_ = b;
                return b;
            } else {
                return (ByteString) ref;
            }
        }

        public static final int DATA_FIELD_NUMBER = 2;
        private volatile Object data_;

        /**
         * <code>string data = 2;</code>
         *
         * @return The data.
         */
        @Override
        public String getData() {
            Object ref = data_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                data_ = s;
                return s;
            }
        }

        /**
         * <code>string data = 2;</code>
         *
         * @return The bytes for data.
         */
        @Override
        public ByteString getDataBytes() {
            Object ref = data_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                data_ = b;
                return b;
            } else {
                return (ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;

        @Override
        public boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appKey_)) {
                GeneratedMessageV3.writeString(output, 1, appKey_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(data_)) {
                GeneratedMessageV3.writeString(output, 2, data_);
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appKey_)) {
                size += GeneratedMessageV3.computeStringSize(1, appKey_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(data_)) {
                size += GeneratedMessageV3.computeStringSize(2, data_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PayClient.pay_rpc_param)) {
                return super.equals(obj);
            }
            PayClient.pay_rpc_param other = (PayClient.pay_rpc_param) obj;

            if (!getAppKey().equals(other.getAppKey())) return false;
            if (!getData().equals(other.getData())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + APP_KEY_FIELD_NUMBER;
            hash = (53 * hash) + getAppKey().hashCode();
            hash = (37 * hash) + DATA_FIELD_NUMBER;
            hash = (53 * hash) + getData().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static PayClient.pay_rpc_param parseFrom(java.nio.ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PayClient.pay_rpc_param parseFrom(java.nio.ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PayClient.pay_rpc_param parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PayClient.pay_rpc_param parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PayClient.pay_rpc_param parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PayClient.pay_rpc_param parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PayClient.pay_rpc_param parseFrom(java.io.InputStream input) throws java.io.IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PayClient.pay_rpc_param parseFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static PayClient.pay_rpc_param parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static PayClient.pay_rpc_param parseDelimitedFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static PayClient.pay_rpc_param parseFrom(CodedInputStream input) throws java.io.IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PayClient.pay_rpc_param parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(PayClient.pay_rpc_param prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            return new Builder(parent);
        }

        /**
         * Protobuf type {@code pay_rpc_param}
         */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PayClient.pay_rpc_paramOrBuilder {
            public static Descriptors.Descriptor getDescriptor() {
                return PayClient.internal_static_com_xmpay_sdk_agrpc_pay_rpc_param_descriptor;
            }

            @Override
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PayClient.internal_static_com_xmpay_sdk_agrpc_pay_rpc_param_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(PayClient.pay_rpc_param.class, PayClient.pay_rpc_param.Builder.class);
            }

            // Construct using PayClient.pay_rpc_param.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            @Override
            public Builder clear() {
                super.clear();
                appKey_ = "";

                data_ = "";

                return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PayClient.internal_static_com_xmpay_sdk_agrpc_pay_rpc_param_descriptor;
            }

            @Override
            public PayClient.pay_rpc_param getDefaultInstanceForType() {
                return PayClient.pay_rpc_param.getDefaultInstance();
            }

            @Override
            public PayClient.pay_rpc_param build() {
                PayClient.pay_rpc_param result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public PayClient.pay_rpc_param buildPartial() {
                PayClient.pay_rpc_param result = new PayClient.pay_rpc_param(this);
                result.appKey_ = appKey_;
                result.data_ = data_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return super.clone();
            }

            @Override
            public Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return super.setField(field, value);
            }

            @Override
            public Builder clearField(Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @Override
            public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof PayClient.pay_rpc_param) {
                    return mergeFrom((PayClient.pay_rpc_param) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(PayClient.pay_rpc_param other) {
                if (other == PayClient.pay_rpc_param.getDefaultInstance()) return this;
                if (!other.getAppKey().isEmpty()) {
                    appKey_ = other.appKey_;
                    onChanged();
                }
                if (!other.getData().isEmpty()) {
                    data_ = other.data_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override
            public boolean isInitialized() {
                return true;
            }

            @Override
            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                PayClient.pay_rpc_param parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (PayClient.pay_rpc_param) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private Object appKey_ = "";

            /**
             * <code>string app_key = 1;</code>
             *
             * @return The appKey.
             */
            public String getAppKey() {
                Object ref = appKey_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    appKey_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string app_key = 1;</code>
             *
             * @return The bytes for appKey.
             */
            public ByteString getAppKeyBytes() {
                Object ref = appKey_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    appKey_ = b;
                    return b;
                } else {
                    return (ByteString) ref;
                }
            }

            /**
             * <code>string app_key = 1;</code>
             *
             * @param value The appKey to set.
             * @return This builder for chaining.
             */
            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                appKey_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string app_key = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAppKey() {

                appKey_ = getDefaultInstance().getAppKey();
                onChanged();
                return this;
            }

            /**
             * <code>string app_key = 1;</code>
             *
             * @param value The bytes for appKey to set.
             * @return This builder for chaining.
             */
            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                appKey_ = value;
                onChanged();
                return this;
            }

            private Object data_ = "";

            /**
             * <code>string data = 2;</code>
             *
             * @return The data.
             */
            public String getData() {
                Object ref = data_;
                if (!(ref instanceof String)) {
                    ByteString bs = (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    data_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string data = 2;</code>
             *
             * @return The bytes for data.
             */
            public ByteString getDataBytes() {
                Object ref = data_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    data_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string data = 2;</code>
             *
             * @param value The data to set.
             * @return This builder for chaining.
             */
            public Builder setData(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                data_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string data = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearData() {

                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }

            /**
             * <code>string data = 2;</code>
             *
             * @param value The bytes for data to set.
             * @return This builder for chaining.
             */
            public Builder setDataBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                data_ = value;
                onChanged();
                return this;
            }

            @Override
            public Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @Override
            public Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:pay_rpc_param)
        }

        // @@protoc_insertion_point(class_scope:pay_rpc_param)
        private static final PayClient.pay_rpc_param DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new PayClient.pay_rpc_param();
        }

        public static PayClient.pay_rpc_param getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final Parser<pay_rpc_param> PARSER = new AbstractParser<pay_rpc_param>() {
            @Override
            public pay_rpc_param parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new pay_rpc_param(input, extensionRegistry);
            }
        };

        public static Parser<pay_rpc_param> parser() {
            return PARSER;
        }

        @Override
        public Parser<pay_rpc_param> getParserForType() {
            return PARSER;
        }

        @Override
        public PayClient.pay_rpc_param getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final Descriptors.Descriptor internal_static_com_xmpay_sdk_agrpc_pay_rpc_resp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xmpay_sdk_agrpc_pay_rpc_resp_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_xmpay_sdk_agrpc_pay_rpc_param_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xmpay_sdk_agrpc_pay_rpc_param_fieldAccessorTable;

    @Getter
    private static final Descriptors.FileDescriptor descriptor;

    static {
        String[] descriptorData = {
                "\n\020pay_client.proto\022\023com.xmpay.sdk.agrpc\"" +
                        ";\n\014pay_rpc_resp\022\014\n\004code\030\001 \001(\005\022\017\n\007message" +
                        "\030\002 \001(\t\022\014\n\004data\030\003 \001(\t\".\n\rpay_rpc_param\022\017\n" +
                        "\007app_key\030\001 \001(\t\022\014\n\004data\030\002 \001(\t2\346\004\n\013pay_ser" +
                        "vice\022X\n\017virtual_account\022\".com.xmpay.sdk." +
                        "agrpc.pay_rpc_param\032!.com.xmpay.sdk.agrp" +
                        "c.pay_rpc_resp\022P\n\007receive\022\".com.xmpay.sd" +
                        "k.agrpc.pay_rpc_param\032!.com.xmpay.sdk.ag" +
                        "rpc.pay_rpc_resp\022V\n\rreceive_query\022\".com." +
                        "xmpay.sdk.agrpc.pay_rpc_param\032!.com.xmpa" +
                        "y.sdk.agrpc.pay_rpc_resp\022L\n\003out\022\".com.xm" +
                        "pay.sdk.agrpc.pay_rpc_param\032!.com.xmpay." +
                        "sdk.agrpc.pay_rpc_resp\022R\n\tout_query\022\".co" +
                        "m.xmpay.sdk.agrpc.pay_rpc_param\032!.com.xm" +
                        "pay.sdk.agrpc.pay_rpc_resp\022V\n\rchannel_qu" +
                        "ery\022\".pay_rpc_param\032" +
                        "!.pay_rpc_resp\022Y\n\020me" +
                        "rchant_balance\022\".pay" +
                        "_rpc_param\032!.pay_rpc" +
                        "_respb\006proto3"
        };
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{});
        internal_static_com_xmpay_sdk_agrpc_pay_rpc_resp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_com_xmpay_sdk_agrpc_pay_rpc_resp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_xmpay_sdk_agrpc_pay_rpc_resp_descriptor, new String[]{"Code", "Message", "Data",});
        internal_static_com_xmpay_sdk_agrpc_pay_rpc_param_descriptor = getDescriptor().getMessageTypes().get(1);
        internal_static_com_xmpay_sdk_agrpc_pay_rpc_param_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_xmpay_sdk_agrpc_pay_rpc_param_descriptor, new String[]{"AppKey", "Data",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
