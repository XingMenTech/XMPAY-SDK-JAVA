package com.xmpay.sdk.models;

import cn.hutool.core.annotation.Alias;
import cn.hutool.json.JSONUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

public class Receive {

    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static final class Param extends BaseParam implements Serializable {
        private static final long serialVersionUID = 0L;
        private long amount;
        private String mode;
        @Alias("return_url")
        private String returnUrl;
        private String subject;
        private String body;
    }

    @Data
    public static final class Resp implements Serializable {
        private static final long serialVersionUID = 0L;
        private String orderNo;
        private String merchantNo;
        private String payUrl;

        public static Resp parseFrom(String data) {
            return JSONUtil.toBean(data, Resp.class);
        }

    }
}
