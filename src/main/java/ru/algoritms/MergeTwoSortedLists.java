package ru.algoritms;

import java.util.*;

public class MergeTwoSortedLists {
    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>(list1.size() + list2.size());
        list.addAll(list1);
        list.addAll(list2);
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 7);
        List<Integer> list2 = List.of(2, 4, 5, 7);
        List<Integer> list = mergeTwoLists(list1, list2);
        list.stream().forEach(System.out::println);
    }
}
