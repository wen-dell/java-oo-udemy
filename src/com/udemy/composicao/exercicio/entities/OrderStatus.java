package com.udemy.composicao.exercicio.entities;

public enum OrderStatus {

    PENDING_PAYMENT("Pending payment"),
    PROCESSING("Processing"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered");

    private String value;

    OrderStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
