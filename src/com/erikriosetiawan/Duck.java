package com.erikriosetiawan;

public abstract class Duck {

    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }
}
