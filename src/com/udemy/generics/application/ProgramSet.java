package com.udemy.generics.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {

    public static void main(String[] args) {

        // addAll() -> união
        // retainAll() -> interseção
        // removeAll() -> diferença

        // Sem ordem, porém mais rápido (tabela de hash)
        Set<String> hashSet = new HashSet<>();
        // Com ordem, porém lento (árvore rubro negra)
        Set<String> treeSet = new TreeSet<>();
        // Mantém a ordem em que os elementos são adicionados
        Set<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("TV");
        hashSet.add("Tablet");
        hashSet.add("Notebook");

        treeSet.add("TV");
        treeSet.add("Tablet");
        treeSet.add("Notebook");

        linkedHashSet.add("TV");
        linkedHashSet.add("Tablet");
        linkedHashSet.add("Notebook");

        hashSet.remove("Tablet");
        hashSet.removeIf(x -> x.length() >= 3);

        System.out.println(hashSet.contains("Notebook"));

        for (String p : hashSet) {
            System.out.println(p);
        }

        for (String p : treeSet) {
            System.out.println(p);
        }

        for (String p : linkedHashSet) {
            System.out.println(p);
        }

    }

}
