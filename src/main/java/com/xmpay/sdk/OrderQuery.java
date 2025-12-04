package com.xmpay.sdk;

import cn.hutool.core.annotation.Alias;
import cn.hutool.json.JSONUtil;
import com.google.protobuf.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

public class OrderQuery {

    @Data
    @Builder
    public static final class Param implements Serializable {
        private static final long serialVersionUID = 0L;
        @Alias("order_no")
        private volatile String orderNo;
        @Alias("merchant_no")
        private volatile String merchantNo;

    }

    @Data
    public static final class Resp implements Serializable {
        private static final long serialVersionUID = 0L;
        private volatile String orderNo;
        private volatile String merchantNo;
        private volatile String payNo;
        private long amount;
        private long fee;
        private OrderStatus status;
        private long updateTime;

        public static Resp parseFrom(String data) {
            return JSONUtil.toBean(data, Resp.class);
        }

    }

}
