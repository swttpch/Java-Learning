package oop.copyObjects;

public class CopyObjects {

    public void execute() {

        Car car1 = new Car("Fiat", "Uno", 2000);
        //Car car2 = new Car("Chevrolet", "Corsa", 2005);
        //car2.copy(car1); //correto!

        // não pode fazer:
        //car2 = car1; // pois eles vão ter o mesmo lugar na memoria, e você não quer isso

        //method overloaded:
        Car car2 = new Car(car1);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }

}