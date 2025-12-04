package com.xmpay.sdk;

import lombok.Data;

import java.io.Serializable;

@Data
public class Balance implements Serializable {
    private static final long serialVersionUID = 0L;
    private String name;
    private long total;
    private long available;
    private long settlement;
}
