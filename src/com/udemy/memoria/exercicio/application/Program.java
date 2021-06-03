package com.udemy.memoria.exercicio.application;

import com.udemy.memoria.exercicio.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quantity = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.println();
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("Id: ");
            Long id = sc.nextLong();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            employeeList.add(new Employee(id, name, salary));
        }

        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        Long id = sc.nextLong();
        System.out.print("Enter the percentage: ");
        Double percentage = sc.nextDouble();

        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                Double salary = employee.getSalary();
                salary += salary * (percentage / 100);
                employee.setSalary(salary);
            }
        }

        System.out.println();
        System.out.println("List of employees:");
        employeeList.forEach(System.out::println);

        sc.close();

    }

}
