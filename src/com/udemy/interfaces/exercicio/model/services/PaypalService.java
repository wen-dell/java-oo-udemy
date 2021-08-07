package com.udemy.interfaces.exercicio.model.services;

public class PaypalService implements PaymentService {

    @Override
    public double payment(double amount, int month) {
        double interestRate = 0.01;
        double paymentRate = 0.02;
        double total = amount;
        total += amount * interestRate * month;
        total += total * paymentRate;
        return total;
    }

}
