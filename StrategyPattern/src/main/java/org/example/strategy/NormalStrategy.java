package org.example.strategy;

public class NormalStrategy implements Strategy{
    @Override
    public void drive() {
        System.out.println("drive normally");
    }
}
