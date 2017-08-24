package com.jazasoft.factorymethod;

/**
 * Created by mdzahidraza on 24/08/17.
 */
public class VegPizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for Veg Pizza");
    }
}
