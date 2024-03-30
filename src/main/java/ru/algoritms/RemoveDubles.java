package ru.algoritms;

import java.util.*;

public class RemoveDubles {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 1, 2, 2, 2, 3);
        Collection<Integer> result = removeDuplicates(list);
        result.forEach(System.out::println);
    }
}
