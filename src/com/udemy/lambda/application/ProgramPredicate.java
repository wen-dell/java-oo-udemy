package com.udemy.lambda.application;

import com.udemy.lambda.entities.Product;
import com.udemy.lambda.util.ProductPredicate;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ProgramPredicate {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Predicate<Product> pred = product -> product.getPrice() >= 100.00;

        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p);
        }

    }

}
