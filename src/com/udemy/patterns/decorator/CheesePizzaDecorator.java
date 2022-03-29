package com.udemy.patterns.decorator;

public class CheesePizzaDecorator extends PizzaDecorator{

    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Cheese topic pizza");
    }
}
