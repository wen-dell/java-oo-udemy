package com.udemy.heranca.application;

import com.udemy.heranca.entities.Account;
import com.udemy.heranca.entities.SavingsAccount;

public class AppPolimorphism {

    public static void main(String[] args) {

        /*
        * Em POO, polimorfismo é o recurso que permite que variáveis de um mesmo tipo mais genérico
        * possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes
        * conforme cada tipo específico.
        *
        * Ou resumindo:
        *
        * Variáveis do mesmo tipo que podem ter comportamentos diferentes.
        * */

        Account x = new Account(1020, "Alex", 500.0);
        Account y = new SavingsAccount(1023, "Maria", 500.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }

}
