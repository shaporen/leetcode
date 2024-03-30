package ru.algoritms;

import java.util.*;
import java.util.stream.*;

/**
 * Класс для подсчета количества уникальных цифр в числе
 */
public class CountOfNumbers {
    public static Map<String, Integer> toMap(int number) {
        String numToStr = Integer.toString(number);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numToStr.length(); i++) {
            map.put(String.valueOf(numToStr.charAt(i)),
                    map.getOrDefault(String.valueOf(numToStr.charAt(i)), 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = toMap(1111333599);
        for (String key : map.keySet()) {
            String value = map.get(key).toString();
            System.out.println("Число: " + key + " - " + value);
        }
    }
}