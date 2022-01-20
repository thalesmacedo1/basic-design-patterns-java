package com.designpatterns.gof.singleton;

/**
 * Eager Singleton
 * @author thalesmacedo1
 */

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance() {
        if (instance == null){
            instance = new SingletonEager();
        }
        return instance;
    }

}
