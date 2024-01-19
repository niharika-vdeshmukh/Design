package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pizza p = new ExtraCheesePiazza(new BasePizza());
        System.out.println(p.price());
        p = new ExtraCheesePiazza(new MushroomPizza(new CheesePizza()));
        System.out.println(p.price());
        p = new MushroomPizza(new CheesePizza());
        System.out.println(p.price());
    }
}