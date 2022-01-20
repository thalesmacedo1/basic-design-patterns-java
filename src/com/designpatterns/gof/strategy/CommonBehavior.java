package com.designpatterns.gof.strategy;

public class CommonBehavior implements Behavior{

    @Override
    public void move() {
        System.out.println("It's moving normally...");
    }
}
