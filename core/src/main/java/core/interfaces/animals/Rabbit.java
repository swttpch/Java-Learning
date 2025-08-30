package core.interfaces.animals;

import core.interfaces.interfaces.Prey;

public class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("*The rabbit is fleeing");
    }
}