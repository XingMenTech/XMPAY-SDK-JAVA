package com.xmpay.sdk.models;

import cn.hutool.core.annotation.Alias;
import cn.hutool.json.JSONUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

public class Out {

    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static final class Param extends BaseParam implements Serializable {
        private static final long serialVersionUID = 0L;

        private long amount;
        @Alias("bank_code")
        private String bankCode;
        @Alias("bank_name")
        private String bankName;
        @Alias("bank_no")
        private String bankNo;
        private String mode;
        private String subject;
        private String body;


    }

    @Data
    public static final class Resp implements Serializable {
        private static final long serialVersionUID = 0L;
        private volatile String orderNo;
        private volatile String merchantNo;

        public static Resp parseFrom(String data) {
            return JSONUtil.toBean(data, Resp.class);
        }

    }
}
