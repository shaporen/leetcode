package ru.algoritms;

import java.util.*;

public class MergeTwoSortedLists {
    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>(list1.size() + list2.size());
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) >= list2.get(i)) {
                list.add(list2.get(i));
                list.add(list1.get(i));
            } else {
                list.add(list1.get(i));
                list.add(list2.get(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 7);
        List<Integer> list2 = List.of(2, 4, 5);
        List<Integer> list = mergeTwoLists(list1, list2);
        list.stream().forEach(System.out::println);
    }
}
