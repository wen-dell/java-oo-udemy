package com.udemy.generics.application;

public class ProgramEquals {

    public static void main(String[] args) {

        String a = "Maria";
        String b = "Alex";

        // equals é um método usado para comparar valores

        System.out.println(a.equals(b));

        // hashcode é um número inteiro gerado a partir das informações do objeto

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        // Para dados com o mesmo conteúdo, é gerado o mesmo hashcode
        // O hashcode pode dar "colisões" ou seja, objetos diferentes que
        // coincidentemente geraram o mesmo código hash (muito difícil de acontecer)

        System.out.println("Alice".hashCode());
        System.out.println("Alice".hashCode());

    }

}
