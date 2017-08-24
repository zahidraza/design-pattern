package com.jazasoft.factorymethod;

/**
 * Created by mdzahidraza on 24/08/17.
 */
public class CheesePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for Cheese Pizza");
    }
}
