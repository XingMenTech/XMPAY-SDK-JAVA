package com.xmpay.sdk;

public enum OrderType {
    RECEIVE(1), OUT(2), VIRTUAL(3);

    private final int value;

    public final int getNumber() {
        return this.value;
    }

    public static OrderType valueOf(int value) {
        return forNumber(value);
    }

    public static OrderType forNumber(int value) {
        switch (value) {
            case 1:
                return RECEIVE;
            case 2:
                return OUT;
            case 3:
                return VIRTUAL;
            default:
                return null;
        }
    }

    OrderType(int value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}