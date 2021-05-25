package com.udemy.condicional;

public class Escopo {

    public static void main(String[] args) {

        double price = 400.00;

        if (price < 200.00) {
            double discount = price * 0.1;
        }

        //System.out.println(discount); Fora do escopo

    }

}
