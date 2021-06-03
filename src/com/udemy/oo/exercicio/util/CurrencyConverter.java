package com.udemy.oo.exercicio.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double convert(double price, double quantity) {
        price += price * IOF;
        return price * quantity;
    }

}
