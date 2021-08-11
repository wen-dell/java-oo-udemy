package com.udemy.generics.application;

import com.udemy.generics.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class ProgramTreeSet {

    public static void main(String[] args) {

        // Ordena pelo método compareTo ou um Comparator
        Set<Product> set = new TreeSet<>();

        set.add(new Product("Tv", 900.00));
        set.add(new Product("Notebook", 1200.00));
        set.add(new Product("Tablet", 400.00));

        for (Product p : set) {
            System.out.println(p);
        }

    }

}
