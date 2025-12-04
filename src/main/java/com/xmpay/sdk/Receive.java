package com.xmpay.sdk;

import cn.hutool.core.annotation.Alias;
import cn.hutool.json.JSONUtil;
import com.google.protobuf.*;
import com.xmpay.sdk.grpc.PayClient;
import lombok.Builder;
import lombok.Data;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class Receive {

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
        private String mode;
        private int pid;
        @Alias("id_num")
        private String idNum;
        @Alias("notify_url")
        private String notifyUrl;
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
