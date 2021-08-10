package com.udemy.generics.application;

import com.udemy.generics.entities.Client;

public class ProgramCustomEquals {

    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "alexmaria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

    }

}
