package com.xmpay.sdk;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConfigProperties implements Serializable {
    private static final long serialVersionUID = 0L;

    /**
     * 客户端类型
     */
    private ClientType clientType;

    /**
     * 接口地址
     */
    private String apiUrl;
    /**
     * 应用KEY
     */
    private String appKey;
    /**
     * 应用密钥
     */
    private String appSecret;
    /**
     * 代理CA证书
     */
    private String proxyCa;

    /**
     * 充值商户ID
     */
    private Integer inId;

    /**
     * 提现商户ID
     */
    private Integer outId;

    /**
     * 充值回调地址
     */
    private String inNotifyUrl;

    /**
     * 提现回调地址
     */
    private String outNotifyUrl;
}
