package ru.algoritms;

import java.util.*;
import java.util.stream.*;

/**
 * Класс для подсчета количества уникальных символов
 * в введенной строке
 */
public class NumberOfChars {
    /**
     * Метод использует StreamApi для подсчета количества
     * уникальных символов в введенной строке
     */
    public static void withStream() {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        str = in.nextLine().toLowerCase();
        String[] chars = str.split("");

        Map<String, Long> map =  Arrays.stream(chars)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
    /**
     * Метод использует TreeMap для подсчета количества
     * уникальных символов в введенной строке и хранения их
     * в отсортированном виде
     */
    public static void withTreeMap() {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        str = in.nextLine().toLowerCase();
        String[] chars = str.split("");

        Map<String, Integer> map = new TreeMap<>();
        for (String ch : chars) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
