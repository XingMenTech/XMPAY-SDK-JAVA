package com.xmpay.sdk;

import cn.hutool.json.JSONUtil;

import java.util.List;

public interface Client {

    Virtual.Resp virtualAccount(Virtual.Param param) throws Exception;

    Receive.Resp receive(Receive.Param param) throws Exception;

    OrderQuery.Resp receiveQuery(OrderQuery.Param param) throws Exception;

    Out.Resp out(Out.Param param) throws Exception;

    OrderQuery.Resp outQuery(OrderQuery.Param param) throws Exception;

    List<ChannelQuery.RespItem> channelQuery(ChannelQuery.Param param) throws Exception;

    Balance merchantBalance() throws Exception;

    Aes getAes();

    default  <T> T decrypt(String data, Class<T> clazz) throws Exception {
        String decrypt = getAes().decrypt(data);
        return JSONUtil.toBean(decrypt, clazz);
    }
}
