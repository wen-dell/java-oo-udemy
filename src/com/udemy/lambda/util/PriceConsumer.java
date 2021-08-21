package com.udemy.lambda.util;

import com.udemy.lambda.entities.Product;

import java.util.function.Consumer;

public class PriceConsumer implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }

}
