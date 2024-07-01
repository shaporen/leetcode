package ru.example;

import java.util.*;

public class Example {
    public static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("Charlie"));
        list1.add(new Person("Bob"));
        list1.add(new Person("Alice"));
        list1.sort(Comparator.comparing(Person::getName));
        System.out.println(list1);
    }
}
