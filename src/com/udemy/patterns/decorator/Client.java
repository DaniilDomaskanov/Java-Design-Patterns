package com.udemy.patterns.decorator;

public class Client {

    public static void main(String[] args) {
        Pizza cheeseVeggiPizza = new VeggiPizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        cheeseVeggiPizza.bake();
    }
}
