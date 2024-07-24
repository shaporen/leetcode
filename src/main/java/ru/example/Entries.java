package ru.example;

import java.util.*;

public class Entries {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);

        Set<String> keys = ages.keySet();
        System.out.println("Keys: " + keys);

        for (String key : keys) {
            System.out.println(key);
        }

        Set<Map.Entry<String, Integer>> entries = ages.entrySet();
        System.out.println("Entries: " + entries);

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }

        System.out.println(ages.values());
        Queue<Integer> queue = new ArrayDeque<>();
    }
}
