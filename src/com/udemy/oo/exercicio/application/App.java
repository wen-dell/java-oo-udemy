package com.udemy.oo.exercicio.application;

import com.udemy.oo.exercicio.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantiy = sc.nextDouble();

        double amount = CurrencyConverter.convert(price, quantiy);

        System.out.printf("Amount to be paid in reais = %.2f%n", amount);

        sc.close();

    }

}
