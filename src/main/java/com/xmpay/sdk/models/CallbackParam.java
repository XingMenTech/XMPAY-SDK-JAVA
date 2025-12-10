package com.xmpay.sdk.models;

import lombok.Data;

import java.io.Serializable;

@Data
public final class CallbackParam implements Serializable {
    private static final long serialVersionUID = 0L;
    private volatile String orderNo;
    private volatile String merchantNo;
    private long realAmount;
    private long fee;
    private int status;
    private volatile String remark;
    private long finishTime;
    private volatile String uid;
}
