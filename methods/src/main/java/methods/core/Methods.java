package methods.core;

public class Methods {
    public void callAdd() {
        int x = 3;
        int y = 4;

        int z = add(x,y);

        System.out.println(z);
    }

    public void callHello() {
        String nome = "Igor";
        int idade = 21;

        hello(nome, idade);
    }

    static int add(int x, int y) {
        return x + y;
    }

    static void hello(String nome, int idade) {
        System.out.println("Olá "+nome);
        System.out.println("Você tem "+idade+ " anos");
    }
}