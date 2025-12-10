package com.xmpay.sdk.models;

import cn.hutool.core.annotation.Alias;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
public class BaseParam implements Serializable {
    private static final long serialVersionUID = 0L;

    @Alias("order_no")
    private String orderNo;
    private String uid;
    private String ip;
    private String email;
    private String phone;
    private String name;
    private int pid;
    @Alias("id_num")
    private String idNum;
    @Alias("notify_url")
    private String notifyUrl;
}
