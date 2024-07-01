package ru.example;

import java.util.*;

public class SortThrough {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        /*
        1-й способ перебора элементов коллекции - цикл for
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        /*
        2-й способ перебора элементов коллекции - цикл foreach
         */
        for (Integer l : list) {
            System.out.print(l);
        }
        System.out.println();
        /*
        3-й способ перебора элементов коллекции - итератор
         */
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
        /*
        4-й способ перебора элементов коллекции - метод foreach
         */
        list.forEach(System.out::print);
        System.out.println();
        /*
        5-й способ перебора элементов коллекции - Stream API
         */
        list.stream().forEach(System.out::print);
    }
}
