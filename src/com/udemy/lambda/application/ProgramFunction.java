package com.udemy.lambda.application;

import com.udemy.lambda.entities.Product;
import com.udemy.lambda.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramFunction {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Function<Product, String> function = product -> product.getName().toUpperCase();

        List<String> names = list.stream().map(function).collect(Collectors.toList());

        names.forEach(System.out::println);

    }

}
