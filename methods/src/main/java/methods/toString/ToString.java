package methods.toString;

public class ToString {

    public void execute() {
        // toString() = method especial que todos os object herdam
        // 				que resulta em uma String que representa "textualmente" um object
        // 				pode ser usado de forma implicita ou explicita


        Car car = new Car();

        System.out.println(car); // vai mostrar o endereço da variável na memória
        //System.out.println(car.toString()); // vai mostrar os valores pois existe um method toString na classe car


		/* System.out.println(car.make);
		   System.out.println(car.model);
		   System.out.println(car.color);
		   System.out.println(car.year); */
    }
}
