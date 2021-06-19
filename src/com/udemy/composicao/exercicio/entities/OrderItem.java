package com.udemy.composicao.exercicio.entities;

public class OrderItem {

    private Integer quantity;
    private Product product;

    public OrderItem() {

    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Double subTotal() {
        return this.product.getPrice() * this.quantity;
    }

    @Override
    public String toString() {
        return this.product.getName() + ", " +
                String.format("$ %.2f", this.product.getPrice()) + ", " +
                " Quantity: " + this.quantity + ", " +
                "Subtotal: " + String.format("$%.2f", this.subTotal()) + "\n";
    }
}
