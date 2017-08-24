package com.jazasoft.factorymethod;

import org.testng.annotations.Test;

/**
 * Created by mdzahidraza on 24/08/17.
 */
public class PizzaFactoryTest {

    @Test
    public void testCreatePizza() {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        cheesePizza.addIngredients();
        cheesePizza.bakePizza();
        Pizza vegPizza = pizzaFactory.createPizza("veg");
        vegPizza.addIngredients();
        vegPizza.bakePizza();
    }
}
