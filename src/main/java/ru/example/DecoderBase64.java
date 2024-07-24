package ru.example;

import java.util.*;

public class DecoderBase64 {
    public static void main(String[] args) {
        String encoded = "SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==";
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println(decoded);
    }
}
