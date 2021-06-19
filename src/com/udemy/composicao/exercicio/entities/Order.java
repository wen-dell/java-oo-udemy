package com.udemy.composicao.exercicio.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order() {

    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }

    public Double total() {
        Double sum = 0.0;
        for (OrderItem orderItem : items) {
            sum += orderItem.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY:\n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(client);
        sb.append("\nOrder status: " + status.getValue() + "\n");
        sb.append("Order items:\n");
        for (OrderItem orderItem : items) {
            sb.append(orderItem);
        }
        sb.append("Total price: " + String.format("$%.2f", total()) + "\n");

        return sb.toString();
    }
}
