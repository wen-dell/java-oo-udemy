package com.udemy.composicao.application;

import com.udemy.composicao.entities.Order;
import com.udemy.composicao.entities.OrderStatus;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }

}
