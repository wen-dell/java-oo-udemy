package com.udemy.memoria.exercicio.application;

import java.util.Scanner;

public class AppMatrizes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int number = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == number) {
                    System.out.printf("Position %d,%d:%n", i, j);

                    if (j - 1 >= 0) {
                        System.out.printf("Left: %d%n", mat[i][j-1]);
                    }

                    if (j + 1 < mat[i].length) {
                        System.out.printf("Right: %d%n", mat[i][j+1]);
                    }

                    if (i - 1 >= 0) {
                        System.out.printf("Up: %d%n", mat[i-1][j]);
                    }

                    if (i + 1 < mat.length) {
                        System.out.printf("Down: %d%n", mat[i+1][j]);
                    }

                }
            }
        }

    }

}
