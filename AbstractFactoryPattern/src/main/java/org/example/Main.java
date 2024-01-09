package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AbstractFactory loanFactory =  FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan("HDFC");
        System.out.println(loan.getInterestRate(2.3));
    }
}