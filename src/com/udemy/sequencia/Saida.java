package com.udemy.sequencia;

import java.util.Locale;

public class Saida {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.print("Olá mundo!");
        System.out.println("Bom dia!");

        int y = 32;
        double x = 10.35484;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
    }

}
