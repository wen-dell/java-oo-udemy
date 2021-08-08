package com.udemy.interfaces.application;

import com.udemy.interfaces.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderEmployees {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "/home/wendell/funcionarios.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee e : list) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
