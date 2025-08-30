package core.userInput;

import java.util.Scanner;

public class UserInput {

    public static void execute() {
        /* existem componentes que não estão incluidos na livraria do Java
		 * Então você tem que importar da livraria do JRE
		 Como é o caso do Scanner */

        Scanner scanner = new Scanner(System.in); /*Atribuição do componente Scanner a uma variável
		o new é para um novo método/ o System.in é para reconhecer um input pelo teclado */

        System.out.println("Qual seu nome? "); // Sistema pergunta qual meu nome
        String name = scanner.nextLine(); /* Aqui é onde você vai digitar
		a variável scanner junto com o método nextLine() quer dizer que o Scanner vai ler a proxima 		linha */

        System.out.println("Quantos anos você tem? "); // Sistema pergunta qual sua idade
        int idade = scanner.nextInt(); // a mesma coisa só que com int
        scanner.nextLine(); // é necessario o next line em seguida para que o sistema leia o input a 		seguir

        System.out.println("Qual sua comida favorita? "); // Sistema pergunta qual sua comida favorita
        String comida = scanner.nextLine(); // a mesma coisa do "Qual seu nome?"

        System.out.println("Olá " + name);
        System.out.println("Você tem " + idade + " anos de idade");
        System.out.println("Você gosta de " + comida);

    }
}
