package com.designpatterns.gof.strategy;

public class AggressiveBehavior implements Behavior{

    @Override
    public void move() {
        System.out.println("It's moving as a maniac...");
    }
}
