package com.udemy.interfaces.model.services;

public class UsaInterestService {

    private double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double payment(double amount, int months) {
        if (months < 1) {
            throw new IllegalArgumentException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + interestRate / 100.0, months);
    }

}
