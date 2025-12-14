package com.xmpay.sdk;

import com.xmpay.sdk.models.CallbackParam;

public interface CallbackExecutor {

    /**
     * 执行回调逻辑
     *
     * @param callbackParam 回调参数
     */
    void execute(CallbackParam callbackParam);
}
