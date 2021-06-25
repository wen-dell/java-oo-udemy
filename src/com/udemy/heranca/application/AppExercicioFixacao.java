package com.udemy.heranca.application;

import com.udemy.heranca.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AppExercicioFixacao {

    public static void main(String[] args) throws ParseException {

        List<Product> list = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'c') {
                Product product = new Product(name, price);
                list.add(product);
            } else if (ch == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = format.parse(sc.nextLine());
                Product product = new UsedProduct(name, price, manufactureDate);
                list.add(product);
            } else {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        sc.close();


    }

}
