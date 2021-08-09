package com.udemy.generics.application;


import java.util.*;

public class ProgramPrintList {

    public static void main(String[] args) {

        // Não é possível adicionar dados a uma lista de tipo curinga
        // List<?> list = new ArrayList<>();
        // list.add(2);

        List<Integer> myList = Arrays.asList(5, 2, 10);
        printList(myList);

        System.out.println();

        List<String> myStringList = Arrays.asList("Amanda", "Maria", "Fernanda");
        printList(myStringList);

    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
