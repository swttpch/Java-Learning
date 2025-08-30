package core.ifStatements;

public class IfStatement {

    public void execute() {

        //if statement é um bloco de códigos que vai ser executado se uma condição for verdadeira

        int idade = 12;

        if(idade>=75) { // se a pessoa for maior ou igual a 75 anos
            System.out.println("Idoso...");
        }
        else if (idade>=18) { // se a pessoa for maior ou igual a 18 anos
            System.out.println("você é um adulto!");
        }
        else if (idade>=13) { // se a pessoa for maior ou igual a 13 anos
            System.out.println("você é um adolescente");
        }
        else { // caso nenhum dos if seja ativado, o que leva a crer que a pessoa tem menos do que 12 anos
            System.out.println("você é um bebê");
        }

        //para comparar um valor com outro se for igual, não se usa somente um =, sempre ==. um = é somente para assignment.
    }

}