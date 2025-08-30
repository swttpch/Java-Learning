package oop.abstraction;

public class Abstraction {

    public void execute() {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();


        car.go();
        bicycle.go();

        car.stop();
        bicycle.stop();



    }
}
