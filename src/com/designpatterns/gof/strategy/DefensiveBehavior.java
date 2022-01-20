package com.designpatterns.gof.strategy;

public class DefensiveBehavior implements Behavior{

    @Override
    public void move() {
        System.out.println("It's moving defensively...");
    }
}
