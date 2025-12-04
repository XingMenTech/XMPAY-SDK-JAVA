package com.xmpay.sdk;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Aes {

    private String appKey;
    private String secret;

    public Aes(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * AES-CBC-PKCS#7加密方法
     *
     * @param data 待加密数据
     * @return 加密后的16进制字符串
     */
    public String encrypt(String data) throws Exception {
        // 将密钥转换为字节数组
        byte[] appKeyBytes = Arrays.copyOf(appKey.getBytes(StandardCharsets.UTF_8), 16);
        byte[] secretBytes = Arrays.copyOf(secret.getBytes(StandardCharsets.UTF_8), 16);

        // 创建AES密钥
        SecretKeySpec keySpec = new SecretKeySpec(appKeyBytes, "AES");

        // 创建CBC模式的初始化向量
        IvParameterSpec ivSpec = new IvParameterSpec(secretBytes);

        // 初始化加密器
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

        // 执行加密
        byte[] encrypted = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));

        // 转换为16进制字符串
        StringBuilder hexString = new StringBuilder();
        for (byte b : encrypted) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

    /**
     * AES-CBC-PKCS#7解密方法
     *
     * @param data 待解密数据
     * @return 解密后的字符串
     */
    public String decrypt(String data) throws Exception {
        // 将密钥转换为字节数组
        byte[] appKeyBytes = Arrays.copyOf(appKey.getBytes(StandardCharsets.UTF_8), 16);
        byte[] secretBytes = Arrays.copyOf(secret.getBytes(StandardCharsets.UTF_8), 16);

        // 创建AES密钥
        SecretKeySpec keySpec = new SecretKeySpec(appKeyBytes, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(secretBytes);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        byte[] decrypted = cipher.doFinal(hexStringToByteArray(data));
        return new String(decrypted, StandardCharsets.UTF_8);

    }

    private static byte[] hexStringToByteArray(String data) {
        int len = data.length();

        byte[] bytes = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            bytes[i / 2] = (byte) ((Character.digit(data.charAt(i), 16) << 4)
                    + Character.digit(data.charAt(i + 1), 16));
        }
        return bytes;
    }
}