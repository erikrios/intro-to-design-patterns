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

        Duck model = new ModelDuck();

        // The first call to performFly() delegates to the flyBehavior object
        // set in the FlyBehavior object set in the ModelDuck's constructor,
        // which is a FlyNoWay instance.
        model.performFly();

        // This invokes the model's inherited behavior setter method, and...voila!
        // The model suddenly has rocket-powered flying capability!
        model.setFlyBehavior(new FlyRocketPowered());

        // If it worked, the model duck dynamically changed its flying behavior!
        // You can't do that if the implementation lives inside the duck class.
        model.performFly();
    }
}
