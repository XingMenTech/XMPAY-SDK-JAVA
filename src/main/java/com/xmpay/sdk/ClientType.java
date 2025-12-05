package com.xmpay.sdk;

public enum ClientType {

    HTTP,GRPC;

    public static ClientType getClientType(String type) {
        for (ClientType clientType : ClientType.values()) {
            if (clientType.name().equals(type)) {
                return clientType;
            }
        }
        return null;
    }
    public static ClientType getClientType(int type) {
        for (ClientType clientType : ClientType.values()) {
            if (clientType.ordinal() == type) {
                return clientType;
            }
        }
        return null;
    }
}
