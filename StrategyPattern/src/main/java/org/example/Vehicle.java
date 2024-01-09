package org.example;

import org.example.strategy.Strategy;

public class Vehicle {

    public static Strategy driveStrategy;

    public Vehicle(Strategy strategy) {
        this.driveStrategy = strategy;
    }

    void drive() {
        driveStrategy.drive();
    }
}
