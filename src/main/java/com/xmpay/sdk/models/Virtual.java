package com.xmpay.sdk.models;

import cn.hutool.json.JSONUtil;
import lombok.Data;

import java.io.Serializable;


public class Virtual implements Serializable {

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
