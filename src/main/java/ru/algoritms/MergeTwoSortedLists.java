package ru.algoritms;

import java.util.*;

/**
 * Класс объединяет два неосортированных списка и выводит
 * итоговый список в отсортированном порядке
 */

public class MergeTwoSortedLists {
    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>(list1.size() + list2.size());
        list.addAll(list1);
        list.addAll(list2);
        list.sort(Comparator.reverseOrder());
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(9, 2, 8);
        List<Integer> list2 = List.of(6, 4, 5, 7);
        List<Integer> list = mergeTwoLists(list1, list2);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
