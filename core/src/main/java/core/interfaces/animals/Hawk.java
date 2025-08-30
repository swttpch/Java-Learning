package core.interfaces.animals;

import core.interfaces.interfaces.Predator;

public class Hawk implements Predator {
    @Override
    public void hunt() {
        System.out.println("*The hawk is hunting ");
    }
}