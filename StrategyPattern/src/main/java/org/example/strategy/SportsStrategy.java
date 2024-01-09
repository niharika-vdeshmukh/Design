package org.example.strategy;

public class SportsStrategy implements Strategy{
    @Override
    public void drive() {
        System.out.println("Drive fast");
    }
}
