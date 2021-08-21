package com.udemy.lambda.application;

import java.util.List;
import java.util.ArrayList;

public class ProgramSum {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        Integer sum = integerList.stream().reduce(0, Integer::sum);

        System.out.println("The sum is: " + sum);

    }

}
