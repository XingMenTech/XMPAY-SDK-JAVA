package com.xmpay.sdk.grpc;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.google.protobuf.ByteString;
import com.google.protobuf.util.JsonFormat;
import com.xmpay.sdk.*;
import io.grpc.ManagedChannel;
import com.xmpay.sdk.grpc.PayClient.pay_rpc_param;
import com.xmpay.sdk.grpc.PayClient.pay_rpc_resp;
import io.grpc.internal.JsonParser;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpResponseStatus;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * gRPC Client for Pay Service
 * Implements client methods for all pay service RPCs
 */
public class PayGrpcClient {

    private static final Logger logger = Logger.getLogger(PayGrpcClient.class.getName());

    private final pay_serviceGrpc.pay_serviceBlockingStub blockingStub;

    private final PayConfig config;

    private final Aes aes;

    /**
     * Construct client connecting to pay service server at {@code host:port}.
     *
     * @param config the client config
     */
    public PayGrpcClient(PayConfig config) {
        this.config = config;
        this.aes = new Aes(config.getAppKey(), config.getAppSecret());
        ManagedChannel channel = GrpcClientUtil.createChannel(config.getApiUrl());
        this.blockingStub = pay_serviceGrpc.newBlockingStub(channel);
    }

    /**
     * Create a virtual account
     *
     * @param param the request data
     * @return the response
     */
    public Virtual.Resp virtualAccount(Virtual.Param param) throws Exception {
        logger.info("Calling virtualAccount with appKey: " + aes.getAppKey());
        if(param.getPid() == 0){
            param.setPid(config.getInId());
        }
        if(StrUtil.isBlank(param.getNotifyUrl())){
            param.setNotifyUrl(config.getInNotifyUrl());
        }

        String jsonStr = JSONUtil.toJsonStr(param);
        logger.info("Calling virtualAccount with param: " + jsonStr);

        pay_rpc_param request = pay_rpc_param.newBuilder()
                .setAppKey(aes.getAppKey())
                .setData(aes.encrypt(jsonStr))
                .build();

        pay_rpc_resp resp = blockingStub.virtualAccount(request);
        if (resp.getCode() != HttpResponseStatus.OK.code()) {
            throw new RuntimeException("code:" + resp.getCode() + " message:" + resp.getMessage());
        }

        String data = resp.getData();
        String decrypt = aes.decrypt(data);
        return Virtual.Resp.parseFrom(decrypt);
    }

    /**
     * Create a receive order
     *
     * @param param the request data
     * @return the response
     */
    public Receive.Resp receive(Receive.Param param) throws Exception {
        logger.info("Calling receive with appKey: " + aes.getAppKey());
        if(param.getPid() == 0){
            param.setPid(config.getInId());
        }
        if(StrUtil.isBlank(param.getNotifyUrl())){
            param.setNotifyUrl(config.getInNotifyUrl());
        }
        String jsonStr = JSONUtil.toJsonStr(param);
        logger.info("Calling receive with param: " + jsonStr);
        pay_rpc_param request = pay_rpc_param.newBuilder()
                .setAppKey(aes.getAppKey())
                .setData(aes.encrypt(jsonStr))
                .build();

        pay_rpc_resp resp = blockingStub.receive(request);
        if (resp.getCode() != HttpResponseStatus.OK.code()) {
            throw new RuntimeException("code:" + resp.getCode() + " message:" + resp.getMessage());
        }

        String data = resp.getData();
        String decrypt = aes.decrypt(data);
        return Receive.Resp.parseFrom(decrypt);
    }

    /**
     * Query a receive order
     *
     * @param param the request data
     * @return the response
     */
    public OrderQuery.Resp receiveQuery(OrderQuery.Param param) throws Exception {
        logger.info("Calling receiveQuery with appKey: " + aes.getAppKey());
        String jsonStr = JSONUtil.toJsonStr(param);
        logger.info("Calling receiveQuery with param: " + jsonStr);
        pay_rpc_param request = pay_rpc_param.newBuilder()
                .setAppKey(aes.getAppKey())
                .setData(aes.encrypt(jsonStr))
                .build();

        pay_rpc_resp resp = blockingStub.receiveQuery(request);

        if (resp.getCode() != HttpResponseStatus.OK.code()) {
            throw new RuntimeException("code:" + resp.getCode() + " message:" + resp.getMessage());
        }

        String data = resp.getData();
        String decrypt = aes.decrypt(data);
        return JSONUtil.toBean(decrypt, OrderQuery.Resp.class);
    }

    /**
     * Create an out payment
     *
     * @param param the request data
     * @return the response
     */
    public Out.Resp out(Out.Param param) throws Exception {
        logger.info("Calling out with appKey: " + aes.getAppKey());
        if(param.getPid() == 0){
            param.setPid(config.getOutId());
        }
        if(StrUtil.isBlank(param.getNotifyUrl())){
            param.setNotifyUrl(config.getOutNotifyUrl());
        }
        String jsonStr = JSONUtil.toJsonStr(param);
        logger.info("Calling out with param: " + jsonStr);
        pay_rpc_param request = pay_rpc_param.newBuilder()
                .setAppKey(aes.getAppKey())
                .setData(aes.encrypt(jsonStr))
                .build();
        pay_rpc_resp resp = blockingStub.out(request);
        if (resp.getCode() != HttpResponseStatus.OK.code()) {
            throw new RuntimeException("code:" + resp.getCode() + " message:" + resp.getMessage());
        }

        String data = resp.getData();
        String decrypt = aes.decrypt(data);
        return Out.Resp.parseFrom(decrypt);
    }

    /**
     * Query an out payment
     *
     * @param param the request data
     * @return the response
     */
    public OrderQuery.Resp outQuery(OrderQuery.Param param) throws Exception {
        logger.info("Calling outQuery with appKey: " + aes.getAppKey());

        String jsonStr = JSONUtil.toJsonStr(param);
        logger.info("Calling outQuery with param: " + jsonStr);
        pay_rpc_param request = pay_rpc_param.newBuilder()
                .setAppKey(aes.getAppKey())
                .setData(aes.encrypt(jsonStr))
                .build();
        pay_rpc_resp resp = blockingStub.outQuery(request);

        if (resp.getCode() != HttpResponseStatus.OK.code()) {
            throw new RuntimeException("code:" + resp.getCode() + " message:" + resp.getMessage());
        }

        String data = resp.getData();
        String decrypt = aes.decrypt(data);
        return JSONUtil.toBean(decrypt, OrderQuery.Resp.class);
    }

    /**
     * Query channels
     *
     * @param param the request data
     * @return the response
     */
    public List<ChannelQuery.RespItem> channelQuery(ChannelQuery.Param param) throws Exception {
        logger.info("Calling channelQuery with appKey: " + aes.getAppKey());
        String jsonStr = JSONUtil.toJsonStr(param);
        logger.info("Calling channelQuery with param: " + jsonStr);
        pay_rpc_param request = pay_rpc_param.newBuilder()
                .setAppKey(aes.getAppKey())
                .setData(aes.encrypt(jsonStr))
                .build();

        pay_rpc_resp resp = blockingStub.channelQuery(request);

        if (resp.getCode() != HttpResponseStatus.OK.code()) {
            throw new RuntimeException("code:" + resp.getCode() + " message:" + resp.getMessage());
        }

        String data = resp.getData();
        String decrypt = aes.decrypt(data);
        JSONArray array = JSONUtil.parseArray(decrypt);
        return array.toList(ChannelQuery.RespItem.class);

    }

    /**
     * Query merchant balance
     *
     * @return the response
     */
    public Balance merchantBalance() throws Exception {
        logger.info("Calling merchantBalance with appKey: " + aes.getAppKey());

        pay_rpc_param request = pay_rpc_param.newBuilder()
                .setAppKey(aes.getAppKey())
                .build();
        pay_rpc_resp resp = blockingStub.merchantBalance(request);

        if (resp.getCode() != HttpResponseStatus.OK.code()) {
            throw new RuntimeException("code:" + resp.getCode() + " message:" + resp.getMessage());
        }

        String data = resp.getData();
        String decrypt = aes.decrypt(data);
        return JSONUtil.toBean(decrypt, Balance.class);
    }

    public PayConfig getConfig() {
        return config;
    }
}