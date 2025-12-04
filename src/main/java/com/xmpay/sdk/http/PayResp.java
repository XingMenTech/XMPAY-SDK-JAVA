package com.xmpay.sdk.http;

import lombok.Data;

import java.io.PrintStream;
import java.io.Serializable;

@Data
public class PayResp implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code;
    private String message;
    private String data;
}
