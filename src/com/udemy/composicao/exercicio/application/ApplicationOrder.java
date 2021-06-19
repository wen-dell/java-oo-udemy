package com.udemy.composicao.exercicio.application;

import com.udemy.composicao.exercicio.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ApplicationOrder {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date: ");
        String birthDate = sc.nextLine();

        Client client = new Client(name, email, sdf.parse(birthDate));
        Order order = new Order();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order? ");
        Integer items = sc.nextInt();

        order.setStatus(OrderStatus.valueOf(status));
        order.setClient(client);
        order.setMoment(new Date());

        sc.nextLine();

        for (int i = 0; i < items; i++) {
            System.out.printf("Enter #%d item data:\n", i+1);
            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, product);
            order.addItem(orderItem);
        }

        System.out.println(order);

        sc.close();

    }

}
