package oop.polymorphism;

public class Polymorphism {

    public void execute() {
        // Polymorphism = palavra grega para poly - "Muitas", morph- "formas"
        // 				  A habilidade de um objeto de se identificar com mais de um tipox


        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle,boat};

        for(Vehicle x : racers) {
            x.go();
        }
    }
}
