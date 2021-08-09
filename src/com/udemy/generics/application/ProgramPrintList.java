package com.udemy.generics.application;


import java.util.*;

public class ProgramPrintList {

    public static void main(String[] args) {

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
