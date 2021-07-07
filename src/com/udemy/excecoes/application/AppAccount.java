package com.udemy.excecoes.application;

import com.udemy.excecoes.model.entities.Account;
import com.udemy.excecoes.model.exception.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class AppAccount {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();

            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);
            account.withdraw(amount);

            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();

    }

}
