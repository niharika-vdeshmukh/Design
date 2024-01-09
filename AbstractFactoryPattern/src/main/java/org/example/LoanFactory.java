package org.example;

public class LoanFactory extends AbstractFactory{
    @Override
    Bank getBank(String bankName) {
        return null;
    }

    @Override
    Loan getLoan(String loanName) {
        return null;
    }
}
