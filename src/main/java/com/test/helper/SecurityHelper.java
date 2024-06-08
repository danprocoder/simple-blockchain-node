package com.test.helper;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SecurityHelper {
    public static String hashSHA256(String input) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        for (byte b: hashBytes) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }
}
