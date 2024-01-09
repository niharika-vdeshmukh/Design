package org.example;

abstract class AbstractFactory {
    abstract Bank getBank(String bankName);
    abstract Loan getLoan(String loanName);
}
