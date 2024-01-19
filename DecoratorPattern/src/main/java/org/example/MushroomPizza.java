package org.example;

public class MushroomPizza extends PizzaToppingDecorator{

    Pizza pizza;

    MushroomPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    double price() {
        return this.pizza.price() + 5;
    }
}
