package com.erikriosetiawan;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        // This calls the MallardDuck's in inherited performQuack() method,
        // which then delegates to the object's QuackBehavior (i.e. callQuack()
        // on the duck's inherited quackBehavior reference).
        mallard.performQuack();

        // Then we do the same thing with MallardDuck's
        // inherited performFly() method.
        mallard.performFly();
    }
}
