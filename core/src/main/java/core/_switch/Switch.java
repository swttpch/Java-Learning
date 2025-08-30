package core._switch;

public class Switch {

    public void execute() {
        // Switch = statement que permite testar a igualdade de uma variável comparada com uma lista de valores
        // diferente do if statement, o switch tem a possibilidade de lidar com outros tipos de dados, como byte, short, char, int, enumerated, Strings

        String dia = "Domingo";

        switch(dia) { // se o valor da variável testada não for igual a nenhum valor então não aparecerá nenhum valor, a não ser que exista um default

            case "Domingo": System.out.println("É Domingo!");
                break;
            case "Segunda-feira": System.out.println("É Segunda-feira!");
                break;
            case "Terça-feira": System.out.println("É Terça-feira!");
                break;
            case "Quarta-feira": System.out.println("É Quarta-feira!");
                break;
            case "Quinta-feira": System.out.println("É Quinta-feira!");
                break;
            case "Sexta-feira": System.out.println("É Sexta-feira");
                break;
            case "Sábado": System.out.println("É Sábado");
                break;
            default: System.out.println(dia + " não é um dia da semana");

        }

        // A importância do uso dos "break's" é que sem eles o código é executado por completo, com eles, entende-se que é para parar a leitura
        // O switch é CaseSensi!!!

    }
}
