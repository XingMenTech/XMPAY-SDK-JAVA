package com.xmpay.sdk;

public class ExampleParam {

    public static final PayConfig httpConfig = PayConfig.builder()
            .apiUrl("http://127.0.0.1:9001")
            .appKey("MLR6Lp6Rmx6hqSKd")
            .appSecret("K3HPwtRuAwXhbwhs")
            .inId(601)
            .outId(602)
            .inNotifyUrl("https://manage.xmtest.in/gateway/notify/in")
            .outNotifyUrl("https://manage.xmtest.in/gateway/notify/out")
            .build();

    public static final PayConfig grpcConfig = PayConfig.builder()
            .apiUrl("127.0.0.1:9002")
            .appKey("MLR6Lp6Rmx6hqSKd")
            .appSecret("K3HPwtRuAwXhbwhs")
            .inId(601)
            .outId(602)
            .inNotifyUrl("https://manage.xmtest.in/gateway/notify/in")
            .outNotifyUrl("https://manage.xmtest.in/gateway/notify/out")
            .build();

    public static final Receive.Param receiveParam = Receive.Param.builder()
            .amount(300000)
            .uid("1921")
            .ip("192.168.1.116")
            .email("Yukdkskkssls@gmail.com")
            .phone("13800000000")
            .name("test")
            .pid(601)
            .idNum("2503131209376517")
            .notifyUrl("https://manage.xmtest.in/gateway/notify/in")
            .subject("testReceive")
            .body("testReceive")
            .build();

    public static final Out.Param outParam = Out.Param.builder()
            .amount(300000)
            .uid("1921")
            .ip("192.168.1.116")
            .email("Yukdkskkssls@gmail.com")
            .phone("13800000000")
            .name("test")
            .pid(602)
            .idNum("2503131209376517")
            .mode("3")
            .bankCode("89465364589")
            .bankName("test")
            .bankNo("8946536458965423")
            .notifyUrl("https://manage.xmtest.in/gateway/notify/out")
            .subject("testOut")
            .body("testOut")
            .build();

    public static final Virtual.Param virtualParam = Virtual.Param.builder()
            .uid("1921")
            .ip("192.168.1.116")
            .email("Yukdkskkssls@gmail.com")
            .phone("13800000000")
            .name("test")
            .pid(601)
            .idNum("2503131209376517")
            .notifyUrl("https://jm.xmtest.in/gateway/notify/in")
            .build();
}
