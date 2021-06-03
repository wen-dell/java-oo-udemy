package com.udemy.memoria;

public class Boxing {

    public static void main(String[] args) {

        int x = 20;

        // Boxing
        Object object = x;
        Integer integer = x;

        System.out.println(object);
        System.out.println(integer);

        // Unboxing
        int y = (int) object;

        System.out.println(y);

    }

}
