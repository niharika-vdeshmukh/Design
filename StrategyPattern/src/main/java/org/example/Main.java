package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehicle v = new SportsVehicle();
        v.drive();
        v = new NormalVehicle();
        v.drive();
    }
}