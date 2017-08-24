package com.jazasoft.singleton;

/**
 * Created by mdzahidraza on 25/08/17.
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
