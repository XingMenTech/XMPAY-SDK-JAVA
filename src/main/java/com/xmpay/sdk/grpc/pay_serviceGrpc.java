//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.xmpay.sdk.grpc;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.Descriptors;
import io.grpc.BindableService;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.MethodDescriptor;
import io.grpc.ServerServiceDefinition;
import io.grpc.ServiceDescriptor;
import io.grpc.MethodDescriptor.MethodType;
import io.grpc.protobuf.ProtoFileDescriptorSupplier;
import io.grpc.protobuf.ProtoMethodDescriptorSupplier;
import io.grpc.protobuf.ProtoServiceDescriptorSupplier;
import io.grpc.stub.AbstractAsyncStub;
import io.grpc.stub.AbstractBlockingStub;
import io.grpc.stub.AbstractFutureStub;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ClientCalls;
import io.grpc.stub.ServerCalls;
import io.grpc.stub.StreamObserver;
import io.grpc.stub.annotations.GrpcGenerated;
import io.grpc.stub.annotations.RpcMethod;

@GrpcGenerated
public final class pay_serviceGrpc {
    public static final String SERVICE_NAME = "pb.pay_service";
    private static volatile MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getVirtualAccountMethod;
    private static volatile MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getReceiveMethod;
    private static volatile MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getReceiveQueryMethod;
    private static volatile MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getOutMethod;
    private static volatile MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getOutQueryMethod;
    private static volatile MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getChannelQueryMethod;
    private static volatile MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getMerchantBalanceMethod;
    private static final int METHODID_VIRTUAL_ACCOUNT = 0;
    private static final int METHODID_RECEIVE = 1;
    private static final int METHODID_RECEIVE_QUERY = 2;
    private static final int METHODID_OUT = 3;
    private static final int METHODID_OUT_QUERY = 4;
    private static final int METHODID_CHANNEL_QUERY = 5;
    private static final int METHODID_MERCHANT_BALANCE = 6;
    private static volatile ServiceDescriptor serviceDescriptor;

    private pay_serviceGrpc() {
    }

    @RpcMethod(
            fullMethodName = "pb.pay_service/virtual_account",
            requestType = PayClient.pay_rpc_param.class,
            responseType = PayClient.pay_rpc_resp.class,
            methodType = MethodType.UNARY
    )
    public static MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getVirtualAccountMethod() {
        MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getVirtualAccountMethod;
        if ((getVirtualAccountMethod = pay_serviceGrpc.getVirtualAccountMethod) == null) {
            synchronized (pay_serviceGrpc.class) {
                if ((getVirtualAccountMethod = pay_serviceGrpc.getVirtualAccountMethod) == null) {
                    pay_serviceGrpc.getVirtualAccountMethod = getVirtualAccountMethod = MethodDescriptor.<PayClient.pay_rpc_param, PayClient.pay_rpc_resp>newBuilder()
                            .setType(MethodType.UNARY)
                            .setFullMethodName(MethodDescriptor.generateFullMethodName("pb.pay_service", "virtual_account"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_param.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_resp.getDefaultInstance()))
                            .setSchemaDescriptor(new pay_serviceMethodDescriptorSupplier("virtual_account"))
                            .build();
                }
            }
        }

        return getVirtualAccountMethod;
    }

    @RpcMethod(
            fullMethodName = "pb.pay_service/receive",
            requestType = PayClient.pay_rpc_param.class,
            responseType = PayClient.pay_rpc_resp.class,
            methodType = MethodType.UNARY
    )
    public static MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getReceiveMethod() {
        MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getReceiveMethod;
        if ((getReceiveMethod = pay_serviceGrpc.getReceiveMethod) == null) {
            synchronized (pay_serviceGrpc.class) {
                if ((getReceiveMethod = pay_serviceGrpc.getReceiveMethod) == null) {
                    pay_serviceGrpc.getReceiveMethod = getReceiveMethod = MethodDescriptor.<PayClient.pay_rpc_param, PayClient.pay_rpc_resp>newBuilder()
                            .setType(MethodType.UNARY)
                            .setFullMethodName(MethodDescriptor.generateFullMethodName("pb.pay_service", "receive"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_param.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_resp.getDefaultInstance()))
                            .setSchemaDescriptor(new pay_serviceMethodDescriptorSupplier("receive"))
                            .build();
                }
            }
        }

        return getReceiveMethod;
    }

    @RpcMethod(
            fullMethodName = "pb.pay_service/receive_query",
            requestType = PayClient.pay_rpc_param.class,
            responseType = PayClient.pay_rpc_resp.class,
            methodType = MethodType.UNARY
    )
    public static MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getReceiveQueryMethod() {
        MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getReceiveQueryMethod;
        if ((getReceiveQueryMethod = pay_serviceGrpc.getReceiveQueryMethod) == null) {
            synchronized (pay_serviceGrpc.class) {
                if ((getReceiveQueryMethod = pay_serviceGrpc.getReceiveQueryMethod) == null) {
                    pay_serviceGrpc.getReceiveQueryMethod = getReceiveQueryMethod = MethodDescriptor.<PayClient.pay_rpc_param, PayClient.pay_rpc_resp>newBuilder()
                            .setType(MethodType.UNARY)
                            .setFullMethodName(MethodDescriptor.generateFullMethodName("pb.pay_service", "receive_query"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_param.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_resp.getDefaultInstance()))
                            .setSchemaDescriptor(new pay_serviceMethodDescriptorSupplier("receive_query"))
                            .build();
                }
            }
        }

        return getReceiveQueryMethod;
    }

    @RpcMethod(
            fullMethodName = "pb.pay_service/out",
            requestType = PayClient.pay_rpc_param.class,
            responseType = PayClient.pay_rpc_resp.class,
            methodType = MethodType.UNARY
    )
    public static MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getOutMethod() {
        MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getOutMethod;
        if ((getOutMethod = pay_serviceGrpc.getOutMethod) == null) {
            synchronized (pay_serviceGrpc.class) {
                if ((getOutMethod = pay_serviceGrpc.getOutMethod) == null) {
                    pay_serviceGrpc.getOutMethod = getOutMethod = MethodDescriptor.<PayClient.pay_rpc_param, PayClient.pay_rpc_resp>newBuilder()
                            .setType(MethodType.UNARY)
                            .setFullMethodName(MethodDescriptor.generateFullMethodName("pb.pay_service", "out"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_param.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_resp.getDefaultInstance()))
                            .setSchemaDescriptor(new pay_serviceMethodDescriptorSupplier("out"))
                            .build();
                }
            }
        }

        return getOutMethod;
    }

    @RpcMethod(
            fullMethodName = "pb.pay_service/out_query",
            requestType = PayClient.pay_rpc_param.class,
            responseType = PayClient.pay_rpc_resp.class,
            methodType = MethodType.UNARY
    )
    public static MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getOutQueryMethod() {
        MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getOutQueryMethod;
        if ((getOutQueryMethod = pay_serviceGrpc.getOutQueryMethod) == null) {
            synchronized (pay_serviceGrpc.class) {
                if ((getOutQueryMethod = pay_serviceGrpc.getOutQueryMethod) == null) {
                    pay_serviceGrpc.getOutQueryMethod = getOutQueryMethod = MethodDescriptor.<PayClient.pay_rpc_param, PayClient.pay_rpc_resp>newBuilder()
                            .setType(MethodType.UNARY)
                            .setFullMethodName(MethodDescriptor.generateFullMethodName("pb.pay_service", "out_query"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_param.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_resp.getDefaultInstance()))
                            .setSchemaDescriptor(new pay_serviceMethodDescriptorSupplier("out_query"))
                            .build();
                }
            }
        }

        return getOutQueryMethod;
    }

    @RpcMethod(
            fullMethodName = "pb.pay_service/channel_query",
            requestType = PayClient.pay_rpc_param.class,
            responseType = PayClient.pay_rpc_resp.class,
            methodType = MethodType.UNARY
    )
    public static MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getChannelQueryMethod() {
        MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getChannelQueryMethod;
        if ((getChannelQueryMethod = pay_serviceGrpc.getChannelQueryMethod) == null) {
            synchronized (pay_serviceGrpc.class) {
                if ((getChannelQueryMethod = pay_serviceGrpc.getChannelQueryMethod) == null) {
                    pay_serviceGrpc.getChannelQueryMethod = getChannelQueryMethod = MethodDescriptor.<PayClient.pay_rpc_param, PayClient.pay_rpc_resp>newBuilder()
                            .setType(MethodType.UNARY)
                            .setFullMethodName(MethodDescriptor.generateFullMethodName("pb.pay_service", "channel_query"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_param.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_resp.getDefaultInstance()))
                            .setSchemaDescriptor(new pay_serviceMethodDescriptorSupplier("channel_query"))
                            .build();
                }
            }
        }

        return getChannelQueryMethod;
    }

    @RpcMethod(
            fullMethodName = "pb.pay_service/merchant_balance",
            requestType = PayClient.pay_rpc_param.class,
            responseType = PayClient.pay_rpc_resp.class,
            methodType = MethodType.UNARY
    )
    public static MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getMerchantBalanceMethod() {
        MethodDescriptor<PayClient.pay_rpc_param, PayClient.pay_rpc_resp> getMerchantBalanceMethod;
        if ((getMerchantBalanceMethod = pay_serviceGrpc.getMerchantBalanceMethod) == null) {
            synchronized (pay_serviceGrpc.class) {
                if ((getMerchantBalanceMethod = pay_serviceGrpc.getMerchantBalanceMethod) == null) {
                    pay_serviceGrpc.getMerchantBalanceMethod = getMerchantBalanceMethod = MethodDescriptor.<PayClient.pay_rpc_param, PayClient.pay_rpc_resp>newBuilder()
                            .setType(MethodType.UNARY)
                            .setFullMethodName(MethodDescriptor.generateFullMethodName("pb.pay_service", "merchant_balance"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_param.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    PayClient.pay_rpc_resp.getDefaultInstance()))
                            .setSchemaDescriptor(new pay_serviceMethodDescriptorSupplier("merchant_balance"))
                            .build();
                }
            }
        }

        return getMerchantBalanceMethod;
    }

    public static pay_serviceStub newStub(Channel channel) {
        AbstractStub.StubFactory<pay_serviceStub> factory = new AbstractStub.StubFactory<pay_serviceStub>() {
            public pay_serviceStub newStub(Channel channel, CallOptions callOptions) {
                return new pay_serviceStub(channel, callOptions);
            }
        };
        return pay_serviceGrpc.pay_serviceStub.newStub(factory, channel);
    }

    public static pay_serviceBlockingStub newBlockingStub(Channel channel) {
        AbstractStub.StubFactory<pay_serviceBlockingStub> factory = new AbstractStub.StubFactory<pay_serviceBlockingStub>() {
            public pay_serviceBlockingStub newStub(Channel channel, CallOptions callOptions) {
                return new pay_serviceBlockingStub(channel, callOptions);
            }
        };
        return pay_serviceGrpc.pay_serviceBlockingStub.newStub(factory, channel);
    }

    public static pay_serviceFutureStub newFutureStub(Channel channel) {
        AbstractStub.StubFactory<pay_serviceFutureStub> factory = new AbstractStub.StubFactory<pay_serviceFutureStub>() {
            public pay_serviceFutureStub newStub(Channel channel, CallOptions callOptions) {
                return new pay_serviceFutureStub(channel, callOptions);
            }
        };
        return pay_serviceGrpc.pay_serviceFutureStub.newStub(factory, channel);
    }

    public static ServiceDescriptor getServiceDescriptor() {
        ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (pay_serviceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = ServiceDescriptor.newBuilder("pb.pay_service").setSchemaDescriptor(new pay_serviceFileDescriptorSupplier()).addMethod(getVirtualAccountMethod()).addMethod(getReceiveMethod()).addMethod(getReceiveQueryMethod()).addMethod(getOutMethod()).addMethod(getOutQueryMethod()).addMethod(getChannelQueryMethod()).addMethod(getMerchantBalanceMethod()).build();
                }
            }
        }

        return result;
    }

    public abstract static class pay_serviceImplBase implements BindableService {
        public void virtualAccount(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(pay_serviceGrpc.getVirtualAccountMethod(), responseObserver);
        }

        public void receive(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(pay_serviceGrpc.getReceiveMethod(), responseObserver);
        }

        public void receiveQuery(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(pay_serviceGrpc.getReceiveQueryMethod(), responseObserver);
        }

        public void out(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(pay_serviceGrpc.getOutMethod(), responseObserver);
        }

        public void outQuery(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(pay_serviceGrpc.getOutQueryMethod(), responseObserver);
        }

        public void channelQuery(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(pay_serviceGrpc.getChannelQueryMethod(), responseObserver);
        }

        public void merchantBalance(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(pay_serviceGrpc.getMerchantBalanceMethod(), responseObserver);
        }

        public final ServerServiceDefinition bindService() {
            return ServerServiceDefinition.builder(pay_serviceGrpc.getServiceDescriptor()).addMethod(pay_serviceGrpc.getVirtualAccountMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(this, 0))).addMethod(pay_serviceGrpc.getReceiveMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(this, 1))).addMethod(pay_serviceGrpc.getReceiveQueryMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(this, 2))).addMethod(pay_serviceGrpc.getOutMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(this, 3))).addMethod(pay_serviceGrpc.getOutQueryMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(this, 4))).addMethod(pay_serviceGrpc.getChannelQueryMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(this, 5))).addMethod(pay_serviceGrpc.getMerchantBalanceMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(this, 6))).build();
        }
    }

    public static final class pay_serviceStub extends AbstractAsyncStub<pay_serviceStub> {
        private pay_serviceStub(Channel channel, CallOptions callOptions) {
            super(channel, callOptions);
        }

        protected pay_serviceStub build(Channel channel, CallOptions callOptions) {
            return new pay_serviceStub(channel, callOptions);
        }

        public void virtualAccount(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ClientCalls.asyncUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getVirtualAccountMethod(), this.getCallOptions()), request, responseObserver);
        }

        public void receive(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ClientCalls.asyncUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getReceiveMethod(), this.getCallOptions()), request, responseObserver);
        }

        public void receiveQuery(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ClientCalls.asyncUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getReceiveQueryMethod(), this.getCallOptions()), request, responseObserver);
        }

        public void out(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ClientCalls.asyncUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getOutMethod(), this.getCallOptions()), request, responseObserver);
        }

        public void outQuery(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ClientCalls.asyncUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getOutQueryMethod(), this.getCallOptions()), request, responseObserver);
        }

        public void channelQuery(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ClientCalls.asyncUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getChannelQueryMethod(), this.getCallOptions()), request, responseObserver);
        }

        public void merchantBalance(PayClient.pay_rpc_param request, StreamObserver<PayClient.pay_rpc_resp> responseObserver) {
            ClientCalls.asyncUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getMerchantBalanceMethod(), this.getCallOptions()), request, responseObserver);
        }
    }

    public static final class pay_serviceBlockingStub extends AbstractBlockingStub<pay_serviceBlockingStub> {
        private pay_serviceBlockingStub(Channel channel, CallOptions callOptions) {
            super(channel, callOptions);
        }

        protected pay_serviceBlockingStub build(Channel channel, CallOptions callOptions) {
            return new pay_serviceBlockingStub(channel, callOptions);
        }

        public PayClient.pay_rpc_resp virtualAccount(PayClient.pay_rpc_param request) {
            return ClientCalls.blockingUnaryCall(this.getChannel(), pay_serviceGrpc.getVirtualAccountMethod(), this.getCallOptions(), request);
        }

        public PayClient.pay_rpc_resp receive(PayClient.pay_rpc_param request) {
            return ClientCalls.blockingUnaryCall(this.getChannel(), pay_serviceGrpc.getReceiveMethod(), this.getCallOptions(), request);
        }

        public PayClient.pay_rpc_resp receiveQuery(PayClient.pay_rpc_param request) {
            return ClientCalls.blockingUnaryCall(this.getChannel(), pay_serviceGrpc.getReceiveQueryMethod(), this.getCallOptions(), request);
        }

        public PayClient.pay_rpc_resp out(PayClient.pay_rpc_param request) {
            return ClientCalls.blockingUnaryCall(this.getChannel(), pay_serviceGrpc.getOutMethod(), this.getCallOptions(), request);
        }

        public PayClient.pay_rpc_resp outQuery(PayClient.pay_rpc_param request) {
            return ClientCalls.blockingUnaryCall(this.getChannel(), pay_serviceGrpc.getOutQueryMethod(), this.getCallOptions(), request);
        }

        public PayClient.pay_rpc_resp channelQuery(PayClient.pay_rpc_param request) {
            return ClientCalls.blockingUnaryCall(this.getChannel(), pay_serviceGrpc.getChannelQueryMethod(), this.getCallOptions(), request);
        }

        public PayClient.pay_rpc_resp merchantBalance(PayClient.pay_rpc_param request) {
            return ClientCalls.blockingUnaryCall(this.getChannel(), pay_serviceGrpc.getMerchantBalanceMethod(), this.getCallOptions(), request);
        }
    }

    public static final class pay_serviceFutureStub extends AbstractFutureStub<pay_serviceFutureStub> {
        private pay_serviceFutureStub(Channel channel, CallOptions callOptions) {
            super(channel, callOptions);
        }

        protected pay_serviceFutureStub build(Channel channel, CallOptions callOptions) {
            return new pay_serviceFutureStub(channel, callOptions);
        }

        public ListenableFuture<PayClient.pay_rpc_resp> virtualAccount(PayClient.pay_rpc_param request) {
            return ClientCalls.futureUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getVirtualAccountMethod(), this.getCallOptions()), request);
        }

        public ListenableFuture<PayClient.pay_rpc_resp> receive(PayClient.pay_rpc_param request) {
            return ClientCalls.futureUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getReceiveMethod(), this.getCallOptions()), request);
        }

        public ListenableFuture<PayClient.pay_rpc_resp> receiveQuery(PayClient.pay_rpc_param request) {
            return ClientCalls.futureUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getReceiveQueryMethod(), this.getCallOptions()), request);
        }

        public ListenableFuture<PayClient.pay_rpc_resp> out(PayClient.pay_rpc_param request) {
            return ClientCalls.futureUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getOutMethod(), this.getCallOptions()), request);
        }

        public ListenableFuture<PayClient.pay_rpc_resp> outQuery(PayClient.pay_rpc_param request) {
            return ClientCalls.futureUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getOutQueryMethod(), this.getCallOptions()), request);
        }

        public ListenableFuture<PayClient.pay_rpc_resp> channelQuery(PayClient.pay_rpc_param request) {
            return ClientCalls.futureUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getChannelQueryMethod(), this.getCallOptions()), request);
        }

        public ListenableFuture<PayClient.pay_rpc_resp> merchantBalance(PayClient.pay_rpc_param request) {
            return ClientCalls.futureUnaryCall(this.getChannel().newCall(pay_serviceGrpc.getMerchantBalanceMethod(), this.getCallOptions()), request);
        }
    }

    private static final class MethodHandlers<Req, Resp> implements ServerCalls.UnaryMethod<Req, Resp>, ServerCalls.ServerStreamingMethod<Req, Resp>, ServerCalls.ClientStreamingMethod<Req, Resp>, ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final pay_serviceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(pay_serviceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        public void invoke(Req request, StreamObserver<Resp> responseObserver) {
            switch (this.methodId) {
                case 0:
                    this.serviceImpl.virtualAccount((PayClient.pay_rpc_param) request, (StreamObserver<PayClient.pay_rpc_resp>) responseObserver);
                    break;
                case 1:
                    this.serviceImpl.receive((PayClient.pay_rpc_param) request, (StreamObserver<PayClient.pay_rpc_resp>) responseObserver);
                    break;
                case 2:
                    this.serviceImpl.receiveQuery((PayClient.pay_rpc_param) request, (StreamObserver<PayClient.pay_rpc_resp>) responseObserver);
                    break;
                case 3:
                    this.serviceImpl.out((PayClient.pay_rpc_param) request, (StreamObserver<PayClient.pay_rpc_resp>) responseObserver);
                    break;
                case 4:
                    this.serviceImpl.outQuery((PayClient.pay_rpc_param) request, (StreamObserver<PayClient.pay_rpc_resp>) responseObserver);
                    break;
                case 5:
                    this.serviceImpl.channelQuery((PayClient.pay_rpc_param) request, (StreamObserver<PayClient.pay_rpc_resp>) responseObserver);
                    break;
                case 6:
                    this.serviceImpl.merchantBalance((PayClient.pay_rpc_param) request, (StreamObserver<PayClient.pay_rpc_resp>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }

        }

        public StreamObserver<Req> invoke(StreamObserver<Resp> responseObserver) {
            throw new AssertionError();
        }
    }

    private abstract static class pay_serviceBaseDescriptorSupplier implements ProtoFileDescriptorSupplier, ProtoServiceDescriptorSupplier {
        pay_serviceBaseDescriptorSupplier() {
        }

        public Descriptors.FileDescriptor getFileDescriptor() {
            return PayClient.getDescriptor();
        }

        public Descriptors.ServiceDescriptor getServiceDescriptor() {
            return this.getFileDescriptor().findServiceByName("pay_service");
        }
    }

    private static final class pay_serviceFileDescriptorSupplier extends pay_serviceBaseDescriptorSupplier {
        pay_serviceFileDescriptorSupplier() {
        }
    }

    private static final class pay_serviceMethodDescriptorSupplier extends pay_serviceBaseDescriptorSupplier implements ProtoMethodDescriptorSupplier {
        private final String methodName;

        pay_serviceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        public Descriptors.MethodDescriptor getMethodDescriptor() {
            return this.getServiceDescriptor().findMethodByName(this.methodName);
        }
    }
}