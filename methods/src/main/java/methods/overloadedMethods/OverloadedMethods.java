package methods.overloadedMethods;

public class OverloadedMethods {

    public void execute() {
        // overloaded methods = methods que possuem o mesmo nome mas que possuem parametros diferentes
        //                         nome do method + parametro = method signature (assinatura do método)

        double x = add(1.0,2.0,3.0,4.0); // quando chamado o overloaded method, tem de se certificar que está colocando a quantidadede valores
        // certos, juntamente com o tipo de dado certo

        System.out.println(x);

    }


    static int add(int a, int b) {
        System.out.println("Esse é o overloaded method #1");
        return a+b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Esse é o overloaded method #2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Esse é o overloaded method #3");
        return a+b+c+d;
    }

    static double add(double a, double b) {
        System.out.println("Esse é o overloaded method #4");
        return a+b;
    }

    static double add(double a, double b, double c) {
        System.out.println("Esse é o overloaded method #5");
        return a+b+c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("Esse é o overloaded method #6");
        return a+b+c+d;
    }
}
