package com.udemy.memoria.exercicio.application;

import com.udemy.memoria.exercicio.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int quantity = sc.nextInt();

        Rent[] vect = new Rent[10];

        sc.nextLine();

        for (int i = 0; i < quantity; i++) {
            System.out.println();
            System.out.printf("Rent #%d:%n", i+1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            sc.nextLine();

            vect[i] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.printf("%d: %s%n", i+1, vect[i]);
            }
        }

        sc.close();

    }

}
