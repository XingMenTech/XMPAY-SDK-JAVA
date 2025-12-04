package com.xmpay.sdk;

public enum OrderStatus {
    WAIT(0), PROCESSING(1), ABNORMAL(2), FAILURE(9), SUCCESS(10), UNRECOGNIZED(-1);

    private final int value;

    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        } else {
            return this.value;
        }
    }

    public static OrderStatus valueOf(int value) {
        return forNumber(value);
    }

    public static OrderStatus forNumber(int value) {
        switch (value) {
            case 0:
                return WAIT;
            case 1:
                return PROCESSING;
            case 2:
                return ABNORMAL;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return FAILURE;
            case 10:
                return SUCCESS;
            default:
                return null;
        }
    }

    OrderStatus(int value) {
        this.value = value;
    }
}