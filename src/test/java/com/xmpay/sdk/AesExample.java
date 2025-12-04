package com.xmpay.sdk;

import com.xmpay.sdk.Aes;

public class AesExample {
    public static void main(String[] args) throws Exception {
        String data = "{\"order_type\":1}";
        Aes aes = new Aes("MLR6Lp6Rmx6hqSKd", "K3HPwtRuAwXhbwhs");
        String encrypted = aes.encrypt(data);
        System.out.println("Encrypted data: " + encrypted);

        String decrypted = aes.decrypt(encrypted);
        System.out.println("Decrypted data: " + decrypted);
    }
}
