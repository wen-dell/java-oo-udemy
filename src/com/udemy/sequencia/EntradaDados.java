package com.udemy.sequencia;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        System.out.println("Você digitou: " + x);

        int y = sc.nextInt();

        System.out.println("Você digitou: " + y);

        double z = sc.nextDouble();

        System.out.printf("Você digitou: %.2f", z);

        sc.close();

    }

}
