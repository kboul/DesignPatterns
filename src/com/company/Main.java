package com.company;

public class Main {

    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}
