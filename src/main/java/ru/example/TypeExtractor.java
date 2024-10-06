package ru.example;

import java.lang.reflect.*;
import java.util.*;
/*
попытка написания класса для определения типа коллекции при ее объявлении с помощью рефлексии
 */
public class TypeExtractor {
    public static class Task<T>{
        private int id;
        public Task(){
            System.out.println(extractTypeName(this.getClass()));
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static String extractTypeName(Object collection) {
            Class<?> clazz = collection.getClass();
            Type genericSuperclass = clazz.getGenericSuperclass();
            if (genericSuperclass instanceof ParameterizedType parameterizedType) {
                Type[] typeArguments = parameterizedType.getActualTypeArguments();
                if ((typeArguments.length > 0) && (typeArguments[0] instanceof Class)) {
                    return ((Class<?>) typeArguments[0]).getSimpleName();
                }
            }
            return "Неизвестный тип";
        }
    }

    public static void main(String[] args) {
        Task<Integer> stringTask = new Task<>();
    }
}
