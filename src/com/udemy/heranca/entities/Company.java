package com.udemy.heranca.entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company() {

    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        Double interest = 0.16;
        if (numberOfEmployees > 10) {
            interest = 0.14;
        }

        return getAnualIncome() * interest;
    }

}
