package org.example;

import org.example.strategy.NormalStrategy;

public class NormalVehicle extends Vehicle{

    NormalVehicle() {
        super(new NormalStrategy());
    }
}
