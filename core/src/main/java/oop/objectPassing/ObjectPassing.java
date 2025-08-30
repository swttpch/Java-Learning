package oop.objectPassing;

public class ObjectPassing {

    public void execute() {

        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");


        garage.park(car1); //só da pra passar objetos Car "nome"/ se eu tentar passar Bicicle "nome" não vai funcionar.
        garage.park(car2);
    }
}
