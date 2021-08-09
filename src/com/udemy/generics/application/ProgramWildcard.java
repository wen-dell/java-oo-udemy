package com.udemy.generics.application;

import java.util.ArrayList;
import java.util.List;

public class ProgramWildcard {

    public static void main(String[] args) {

        // O supertipo de qualquer tipo de lista é List<?>
        List<?> myObjs = new ArrayList<>();
        myObjs = new ArrayList<Integer>();
        System.out.println(myObjs);

    }

}
