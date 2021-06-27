package com.udemy.heranca.application;

import com.udemy.heranca.entities.Company;
import com.udemy.heranca.entities.Individual;
import com.udemy.heranca.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppTax {

    public static void main(String[] args) {

        List<TaxPayer> payerList = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char option = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (option == 'c') {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                TaxPayer taxPayer = new Company(name, anualIncome, numberOfEmployees);
                payerList.add(taxPayer);
            } else {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                TaxPayer taxPayer = new Individual(name, anualIncome, healthExpenditures);
                payerList.add(taxPayer);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        Double sum = 0.0;
        for (TaxPayer taxPayer:
             payerList) {
            Double currentTax = taxPayer.tax();
            sum += currentTax;
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", currentTax));
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f\n", sum);

        sc.close();

    }

}
