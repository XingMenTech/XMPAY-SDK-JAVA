package com.xmpay.sdk;

import cn.hutool.json.JSONUtil;
import lombok.Getter;

public abstract class AbstractClient implements Client {

    @Getter
    protected final Aes aes;

    public AbstractClient(String appKey, String secret) {
        this.aes = new Aes(appKey, secret);
    }

    public <T> T decrypt(String data, Class<T> clazz) throws Exception {
        String decrypt = getAes().decrypt(data);
        return JSONUtil.toBean(decrypt, clazz);
    }
}
