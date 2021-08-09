package com.udemy.generics.application;

import com.udemy.generics.entities.Circle;
import com.udemy.generics.entities.Rectangle;
import com.udemy.generics.entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramCopy {

    public static void main(String[] args) {

        // Princípio get/put - covariância
        // Quando a operação get é permita
        // E a operação put não é
        // <? extends Number>
        // List<? extends Number> list = myObjs;
        // list.get(0); --> Ok
        // list.add(1); --> Não é permitido

        // Princípio get/put - contravariância
        // Quando a operação get não é permitida
        // E a operação put é
        // <? super Number>
        // List<? super Number> list = myObjs;
        // list.get(0); --> Não é permitido
        // list.add(1); --> Ok

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        copy(myDoubles, myObjs);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        // source -> covariância (posso acessar)
        // destiny -> contravariância (posso adicionar)
        for (Number number: source) {
            destiny.add(number);
        }
    }

}
