package com.jazasoft.singleton;

/**
 * Created by mdzahidraza on 25/08/17.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
