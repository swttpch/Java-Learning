package inheritance;

public class Main {

    public static void main(String[] args) {
        // inheritance = o processo em que uma classe adquire
        //				 os atributos e methods de outra; herança


        Car car = new Car();

        //car.go();

        Bicycle bike = new Bicycle();

        //bike.go();

        //System.out.println(car.speed);
        //System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }

}