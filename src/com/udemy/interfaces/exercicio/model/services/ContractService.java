package com.udemy.interfaces.exercicio.model.services;

import com.udemy.interfaces.exercicio.model.entities.Contract;
import com.udemy.interfaces.exercicio.model.entities.Installment;
import com.udemy.interfaces.model.entities.CarRental;
import com.udemy.interfaces.model.entities.Invoice;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractService {

    private final Integer installments;
    private final PaymentService paymentService;

    public ContractService(Integer installments, PaymentService paymentService) {
        this.installments = installments;
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract) {
        Date date = new Date();
        double partialValue = contract.getValue() / installments;
        List<Installment> installmentList = new ArrayList<>();
        for (int i = 1; i <= installments; i++) {
            double amount = paymentService.payment(partialValue, i);
            Date dueDate = addMonth(contract.getDate(), i);
            installmentList.add(new Installment(dueDate, amount));
        }
        contract.setInstallments(installmentList);
    }

    private Date addMonth(Date date, Integer months) {
        LocalDate localDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate()
                .plusMonths(months);
        return java.sql.Date.valueOf(localDate);
    }

}
