package com.xmpay.sdk;

import cn.hutool.core.annotation.Alias;
import cn.hutool.json.JSONUtil;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

public class Out {

    @Data
    @Builder
    public static final class Param implements Serializable {
        private static final long serialVersionUID = 0L;
        @Alias("order_no")
        private String orderNo;
        private long amount;
        private String uid;
        private String ip;
        private String email;
        private String phone;
        private String name;
        @Alias("id_num")
        private String idNum;
        private int pid;
        @Alias("bank_code")
        private String bankCode;
        @Alias("bank_name")
        private String bankName;
        @Alias("bank_no")
        private String bankNo;
        private String mode;
        @Alias("notify_url")
        private String notifyUrl;
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
