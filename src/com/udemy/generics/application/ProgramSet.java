package com.udemy.generics.application;

import java.util.HashSet;
import java.util.Set;

public class ProgramSet {

    public static void main(String[] args) {

        // addAll() -> união
        // retainAll() -> interseção
        // removeAll() -> diferença

        // Sem ordem, porém mais rápido
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }

    }

}
