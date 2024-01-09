package org.example;

public class FactoryCreator {

    public static AbstractFactory getFactory(String type) {
        if(type.equals("Bank"))
            return new BankFactory();
        else if(type.equals("Loan"))
            return  new LoanFactory();
        else return null;
    }
}
