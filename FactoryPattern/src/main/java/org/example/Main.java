package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlanFactory factory = new PlanFactory();
        Scanner sc = new Scanner(System.in);
        String plan = sc.nextLine();
        Plan p = factory.getPlan(plan);
        p.calculateBill(20);
    }

}