package oop.objects;

public class Objects {

    public static void main(String[] args) {

        // object = é uma instancia de uma classe que pode conter atributos e methods
        // exemplo: (telefone, mesa, computador, copo de café);

        Car myCar1 = new Car();



        System.out.println(myCar1.model);
        System.out.println(myCar1.make);
        System.out.println();
        myCar1.drive();
        myCar1.brake();


    }
}
