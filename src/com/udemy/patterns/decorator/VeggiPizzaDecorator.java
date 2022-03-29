package com.udemy.patterns.decorator;

public class VeggiPizzaDecorator extends PizzaDecorator{

    public VeggiPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Veggi topic pizza");
    }
}
