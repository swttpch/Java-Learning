package oop.abstraction;

class Bicycle extends Vehicle{


    @Override
    void go() {
        System.out.println("The bicycle is running.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("The bicycle stopped.");
    }
}
