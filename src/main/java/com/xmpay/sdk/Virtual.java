package com.xmpay.sdk;

import cn.hutool.core.annotation.Alias;
import cn.hutool.json.JSONUtil;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


public class Virtual implements Serializable {

    @Data
    @Builder
    public static final class Param implements Serializable {
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

    @Data
    public static final class Resp implements Serializable {
        private static final long serialVersionUID = 0L;
        private String orderNo;
        private String merchantNo;
        private String accountName;
        private String accountNo;
        private String payUrl;

        public static Resp parseFrom(String data) {
            return JSONUtil.toBean(data, Resp.class);
        }


    }

}
