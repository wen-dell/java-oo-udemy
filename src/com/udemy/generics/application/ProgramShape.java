package com.udemy.generics.application;

import com.udemy.generics.entities.Circle;
import com.udemy.generics.entities.Rectangle;
import com.udemy.generics.entities.Shape;

import java.util.List;
import java.util.ArrayList;

public class ProgramShape {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.printf("Total area: %.2f", totalArea(myShapes));

    }

    public static double totalArea(List<Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

}
