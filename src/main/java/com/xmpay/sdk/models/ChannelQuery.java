package com.xmpay.sdk.models;

import cn.hutool.core.annotation.Alias;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

public class ChannelQuery {

    @Data
    @AllArgsConstructor
    public static final class Param implements Serializable {
        private static final long serialVersionUID = 0L;
        @Alias("order_type")
        private int orderType;
    }

    @Data
    public static final class RespItem implements Serializable {
        private static final long serialVersionUID = 0L;
        private long channel;
        private String name;
        private int type;
        private int status;
        private int pid;
        private long singleMin;
        private long singleMax;
        private long dayMax;
        private List<WithdrawMode> withdrawMode;
    }

    @Data
    public static final class WithdrawMode implements Serializable {
        private static final long serialVersionUID = 0L;
        private volatile String code;
        private volatile String name;
    }


}
