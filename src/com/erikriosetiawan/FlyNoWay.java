package com.erikriosetiawan;

public class FlyNoWay implements FlyBehavior {

    // Flying behavior implementation for ducks that do not fly (like rubber ducks and decoy ducks).
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
