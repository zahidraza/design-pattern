package com.jazasoft.factorymethod;

/**
 * Created by mdzahidraza on 24/08/17.
 */
public class PizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        }else if (type.equalsIgnoreCase("veg")) {
            pizza = new VegPizza();
        }else {
            throw new IllegalArgumentException("No Such Pizza");
        }
        return pizza;
    }
}
