package main;

import java.util.Scanner;

public class WhileLoop {

    private String nome = "";

    private Scanner scanner = new Scanner(System.in);

    private void execute() {
        System.out.println("Coloque seu nome: ");
        nome = scanner.nextLine();
    }

    private void afterExecute() {
        System.out.println("Olá " + this.nome);
    }

    public void doApproach(){
        do {
            execute();
        } while(this.nome.isBlank());
        afterExecute();
    }

    public void whileApproach() {
        while (this.nome.isBlank()) {
            execute();
        }
        afterExecute();
    }
}
