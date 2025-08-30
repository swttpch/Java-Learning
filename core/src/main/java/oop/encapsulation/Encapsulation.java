package oop.encapsulation;

public class Encapsulation {

    public void execute() {
        // encapsulation = quando atributos de uma classe vão ser escondidos ou privados
        // 				   só podem ser acessados atraves de methods (getters & setters)
        // 				   você DEVE deixar atributos privados, a não ser que você tenha um motivo para deixar eles publicos/protegidos


        Car car = new Car("Fiat", "Uno", 2000);

        // car.year = 2022; //não vai funcionar pq a variavel é private
        car.setYear(2022);

        //System.out.println(car.make); //não vai funcionar pq a variavel é private
        System.out.println(car.getMake()); // com on método get, agora você consegue ter acesso a variavel
        System.out.println(car.getModel());
        System.out.println(car.getYear());


    }

}