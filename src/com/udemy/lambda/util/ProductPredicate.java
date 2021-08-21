package com.udemy.lambda.util;

import com.udemy.lambda.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.00;
    }

}
