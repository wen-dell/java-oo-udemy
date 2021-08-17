package com.udemy.generics.exercicio.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ProgramCandidate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String key = fields[0];
                int value = Integer.parseInt(fields[1]);
                if (map.containsKey(key)) {
                    Integer actual = map.get(key);
                    actual += value;
                    map.put(key, actual);
                } else {
                    map.put(fields[0], Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }

}
