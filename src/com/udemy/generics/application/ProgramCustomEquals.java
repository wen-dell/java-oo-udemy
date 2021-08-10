package com.udemy.generics.application;

import com.udemy.generics.entities.Client;

public class ProgramCustomEquals {

    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "alexmaria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

        // O compilador dá um tratamento especial para literais, se você usar o new String()
        // estará forçando uma referência, e o compilador não vai dar true
        System.out.println(s1 == s2);

    }

}
