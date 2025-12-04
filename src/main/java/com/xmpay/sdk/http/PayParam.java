package com.xmpay.sdk.http;

import cn.hutool.core.annotation.Alias;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PayParam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Alias("app_key")
    private String appKey;
    private String data;
}