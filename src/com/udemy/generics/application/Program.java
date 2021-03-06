package com.udemy.generics.application;

import com.udemy.generics.services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        // Não pode, type safety ativado
        // ps.addValue("AAA");

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();

    }

}
