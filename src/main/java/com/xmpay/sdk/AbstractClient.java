package com.xmpay.sdk;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.xmpay.sdk.models.CallbackParam;
import lombok.Getter;

import javax.servlet.http.HttpServletRequest;

public abstract class AbstractClient implements Client {

    @Getter
    protected final Aes aes;

    public AbstractClient(String appKey, String secret) {
        this.aes = new Aes(appKey, secret);
    }

    protected <T> T decrypt(String data, Class<T> clazz) throws Exception {
        String decrypt = getAes().decrypt(data);
        return JSONUtil.toBean(decrypt, clazz);
    }

    public void callback(HttpServletRequest request, CallbackExecutor executor) throws Exception {
        String appKey = request.getParameter("appKey");
        if (StrUtil.isBlank(appKey) || !appKey.equals(getAes().getAppKey())) {
            throw new RuntimeException("The appKey parameter is invalid");
        }
        String data = request.getParameter("data");
        if (StrUtil.isBlank(data)) {
            throw new RuntimeException("The data parameter is invalid");
        }

        String decrypt = getAes().decrypt(data);

        CallbackParam callbackParam = JSONUtil.toBean(decrypt, CallbackParam.class);

        executor.execute(callbackParam);
    }
}
