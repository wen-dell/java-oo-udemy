package com.udemy.extra;

import java.util.Locale;
import java.util.Scanner;

/*
* Este programa calculas as raízes de uma equação do segundo grau
* Os valores dos coeficientes devem ser digitados um por linha
* */
public class Comentarios {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta;

        System.out.println("Digite os valores dos coeficientes: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = b * b * 4 * a * c;

        System.out.println("Delta: " + delta); // cálculo doo valor de delta

        sc.close();

    }

}
