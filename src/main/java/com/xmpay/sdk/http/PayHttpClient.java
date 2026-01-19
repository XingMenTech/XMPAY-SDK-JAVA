package com.xmpay.sdk.http;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpException;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpStatus;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.xmpay.sdk.AbstractClient;
import com.xmpay.sdk.models.ChannelQuery;
import com.xmpay.sdk.ConfigProperties;
import com.xmpay.sdk.models.OrderQuery;
import com.xmpay.sdk.models.*;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

;

/**
 * gRPC Client for Pay Service
 * Implements client methods for all pay service RPCs
 */
public class PayHttpClient  extends AbstractClient {

    private static final Logger logger = Logger.getLogger(PayHttpClient.class.getName());

    private static final String CREATE_VIRTUAL_API = "/gateway/api/order/virtual";
    private static final String CREATE_RECEIVE_API = "/gateway/api/order/receive";
    private static final String QUERY_RECEIVE_API = "/gateway/api/order/receive/query";
    private static final String CREATE_OUT_API = "/gateway/api/order/out";
    private static final String QUERY_OUT_API = "/gateway/api/order/out/query";
    private static final String CHANNEL_API = "/gateway/api/channel/query";
    private static final String BALANCE_API = "/gateway/api/merchant/balance";

    private final ConfigProperties configProperties;

    private final String host;

    /**
     * Construct client for accessing pay service server using the existing channel.
     *
     * @param configProperties the managed host
     *
     */
    public PayHttpClient(ConfigProperties configProperties) {
        super(configProperties.getAppKey(), configProperties.getAppSecret());
        this.configProperties = configProperties;
        this.host = configProperties.getApiUrl();
    }

    /**
     * Create a virtual account
     *
     * @param param the request data
     * @return the response
     */
    public Virtual.Resp virtualAccount(BaseParam param) throws Exception {
        logger.info("Calling virtualAccount with appKey: " + aes.getAppKey());
        if(param.getPid() == 0){
            param.setPid(configProperties.getInId());
        }
        if(StrUtil.isBlank(param.getNotifyUrl())){
            param.setNotifyUrl(configProperties.getInNotifyUrl());
        }

        String resp = doRequest(host + CREATE_VIRTUAL_API, param);
        return JSONUtil.toBean(resp, Virtual.Resp.class);
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
            param.setPid(configProperties.getInId());
        }
        if(StrUtil.isBlank(param.getNotifyUrl())){
            param.setNotifyUrl(configProperties.getInNotifyUrl());
        }
        String resp = doRequest(host + CREATE_RECEIVE_API, param);
        return JSONUtil.toBean(resp, Receive.Resp.class);
    }

    /**
     * Query a receive order
     *
     * @param param the request data
     * @return the response
     */
    public OrderQuery.Resp receiveQuery(OrderQuery.Param param) throws Exception {
        logger.info("Calling receiveQuery with appKey: " + aes.getAppKey());
        String resp = doRequest(host + QUERY_RECEIVE_API, param);
        return JSONUtil.toBean(resp, OrderQuery.Resp.class);
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
            param.setPid(configProperties.getOutId());
        }
        if(StrUtil.isBlank(param.getNotifyUrl())){
            param.setNotifyUrl(configProperties.getOutNotifyUrl());
        }
        String resp = doRequest(host + CREATE_OUT_API, param);
        return JSONUtil.toBean(resp, Out.Resp.class);
    }

    /**
     * Query an out payment
     *
     * @param param the request data
     * @return the response
     */
    public OrderQuery.Resp outQuery(OrderQuery.Param param) throws Exception {
        logger.info("Calling outQuery with appKey: " + aes.getAppKey());
        String resp = doRequest(host + QUERY_OUT_API, param);
        return JSONUtil.toBean(resp, OrderQuery.Resp.class);
    }

    /**
     * Query channels
     *
     * @param param the request data
     * @return the response
     */
    public List<ChannelQuery.RespItem> channelQuery(ChannelQuery.Param param) throws Exception {
        logger.info("Calling channelQuery with appKey: " + aes.getAppKey());

        String resp = doRequest(host + CHANNEL_API, param);

        return JSONUtil.toList(resp, ChannelQuery.RespItem.class);

    }

    /**
     * Query merchant balance
     *
     * @return the response
     */
    public Balance merchantBalance() throws Exception {
        logger.info("Calling merchantBalance with appKey: " + aes.getAppKey());
        String resp = doRequest(host + BALANCE_API, null);
        return JSONUtil.toBean(resp, Balance.class);
    }

    private String doRequest(String url, Object param) throws Exception {
        PayParam.PayParamBuilder builder = PayParam.builder().appKey(aes.getAppKey());
        if (Objects.nonNull(param)) {
            String jsonStr = JSONUtil.toJsonStr(param);
            logger.info("Calling channelQuery with param: " + jsonStr);
            String data = aes.encrypt(jsonStr);
            builder = builder.data(data);
        }

        PayParam request = builder.build();
        String reqStr = JSONUtil.toJsonStr(request);
        HttpResponse response = HttpUtil.createPost(url)
                .contentType("application/json")
                .body(reqStr)
                .execute();

        if (response.getStatus() != HttpStatus.HTTP_OK) {
            throw new HttpException("code:" + response.getStatus() + " message:" + response.body());
        }

        String data = response.body();
        PayResp resp = JSONUtil.toBean(data, PayResp.class);
        if (resp.getCode() != HttpStatus.HTTP_OK) {
            throw new RuntimeException("code:" + resp.getCode() + " message:" + resp.getMessage());
        }

        return aes.decrypt(resp.getData());

    }


}