package org.example;

public class ExtraCheesePiazza extends PizzaToppingDecorator{

    Pizza pizza;

    ExtraCheesePiazza(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    double price() {
        return this.pizza.price() + 22;
    }
}
