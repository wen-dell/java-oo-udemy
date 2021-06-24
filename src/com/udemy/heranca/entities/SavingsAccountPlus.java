package com.udemy.heranca.entities;

public class SavingsAccountPlus extends SavingsAccount {

    @Override
    public void withdraw(double amount) {
        this.balance -= amount + 2.0;
    }

}
