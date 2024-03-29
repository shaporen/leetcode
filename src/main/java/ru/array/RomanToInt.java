package ru.array;

import java.util.*;

/**
 * Переводит римские цифры в арабские
 */
public class RomanToInt {
    public static int romanToInt(String s) {
        int ans = 0;
        int num = 0;
        Map<String, Integer> map = new HashMap<>(7);
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            if (map.containsKey(String.valueOf(s.charAt(i)))) {
                num = map.get(String.valueOf(s.charAt(i)));
                if (4 * num < ans) {
                    ans -= num;
                } else {
                    ans += num;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
