package org.example;

import org.example.strategy.SportsStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportsStrategy());
    }
}
