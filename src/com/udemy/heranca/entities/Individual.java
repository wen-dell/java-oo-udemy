package com.udemy.heranca.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        Double interest = null;
        if (getAnualIncome() < 20000.00) {
            interest = 0.15;
        } else {
            interest = 0.25;
        }

        return (getAnualIncome() * interest) - (healthExpenditures * 0.50);
    }

}
