package com.xmpay.sdk.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.AbstractStub;
import java.util.concurrent.TimeUnit;

/**
 * gRPC Client Utility Class
 * Provides common functionality for creating and managing gRPC clients
 */
public class GrpcClientUtil {
    
    private static final int DEFAULT_TIMEOUT_SECONDS = 5;
    
    /**
     * Create a managed channel for gRPC communication
     * 
     * @param host the server host
     * @param port the server port
     * @return ManagedChannel for gRPC communication
     */
    public static ManagedChannel createChannel(String host, int port) {
        return ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext() // For testing purposes. In production, use secure connections
                .keepAliveTime(30, TimeUnit.SECONDS)
                .keepAliveTimeout(5, TimeUnit.SECONDS)
                .keepAliveWithoutCalls(true)
                .maxInboundMessageSize(4 * 1024 * 1024) // 4MB
                .build();
    }
    
    /**
     * Create a managed channel with default port (80)
     * 
     * @param host the server host
     * @return ManagedChannel for gRPC communication
     */
    public static ManagedChannel createChannel(String host) {
        return createChannel(host, 80);
    }
    
    /**
     * Create a gRPC stub with default timeout
     * 
     * @param <T> the stub type
     * @param channel the managed channel
     * @param stubFactory the factory function to create the stub
     * @return configured stub
     */
    public static <T extends AbstractStub<T>> T createStub(ManagedChannel channel, 
                                                           java.util.function.Function<ManagedChannel, T> stubFactory) {
        return createStub(channel, stubFactory, DEFAULT_TIMEOUT_SECONDS);
    }
    
    /**
     * Create a gRPC stub with custom timeout
     * 
     * @param <T> the stub type
     * @param channel the managed channel
     * @param stubFactory the factory function to create the stub
     * @param timeoutSeconds the timeout in seconds
     * @return configured stub
     */
    public static <T extends AbstractStub<T>> T createStub(ManagedChannel channel, 
                                                           java.util.function.Function<ManagedChannel, T> stubFactory, 
                                                           int timeoutSeconds) {
        T stub = stubFactory.apply(channel);
        return stub.withDeadlineAfter(timeoutSeconds, TimeUnit.SECONDS);
    }
    
    /**
     * Gracefully shutdown the channel
     * 
     * @param channel the managed channel to shutdown
     */
    public static void shutdownChannel(ManagedChannel channel) {
        if (channel != null && !channel.isShutdown()) {
            channel.shutdown();
        }
    }
    
    /**
     * Forcefully shutdown the channel
     * 
     * @param channel the managed channel to shutdown
     */
    public static void shutdownChannelNow(ManagedChannel channel) {
        if (channel != null && !channel.isShutdown()) {
            try {
                channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}