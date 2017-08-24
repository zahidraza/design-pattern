package com.jazasoft.singleton;

/**
 * Created by mdzahidraza on 25/08/17.
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
