package com.designpatterns.gof;

import com.designpatterns.gof.facade.Facade;
import com.designpatterns.gof.singleton.SingletonEager;
import com.designpatterns.gof.singleton.SingletonLazy;
import com.designpatterns.gof.singleton.SingletonLazyHolder;
import com.designpatterns.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        // Singleton testing
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy testing
        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new CommonBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(aggressive);
        robot.move();
        robot.move();
        robot.move();

        // Facade testing
        Facade facade = new Facade();
        facade.migrateClient("Thales", "40240570");
    }
}
