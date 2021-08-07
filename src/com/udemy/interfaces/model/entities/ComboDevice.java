package com.udemy.interfaces.model.entities;

public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing");
    }

    @Override
    public String scan() {
        return "Scanning";
    }
}
