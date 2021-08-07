package com.udemy.interfaces.exercicio.application;

import com.udemy.interfaces.exercicio.model.entities.Contract;
import com.udemy.interfaces.exercicio.model.entities.Installment;
import com.udemy.interfaces.exercicio.model.services.ContractService;
import com.udemy.interfaces.exercicio.model.services.PaypalService;
import com.udemy.interfaces.model.entities.CarRental;
import com.udemy.interfaces.model.entities.Vehicle;
import com.udemy.interfaces.model.services.BrazilTaxService;
import com.udemy.interfaces.model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();

        sc.nextLine();

        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.nextLine());

        System.out.print("Contract value: ");
        Double value = sc.nextDouble();

        Contract contract = new Contract(number, date, value);

        System.out.print("Enter number of installments: ");
        Integer installments = sc.nextInt();

        ContractService contractService = new ContractService(installments, new PaypalService());

        contractService.processContract(contract);

        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()) {
            System.out.printf("%s - %.2f\n", installment.getDueDate(), installment.getAmount());
        }

        sc.close();

    }

}
