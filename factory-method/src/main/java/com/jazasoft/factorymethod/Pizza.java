package com.jazasoft.factorymethod;

/**
 * Created by mdzahidraza on 24/08/17.
 */
public abstract class Pizza {

    public abstract void addIngredients();

    public void bakePizza() {
        System.out.println("Pizza baked successfully");
    }
}
