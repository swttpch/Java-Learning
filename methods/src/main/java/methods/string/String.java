package methods.string;

public class String {

    public void execute() {
        //String é um tipo de dado de referencia (reference data type) que armazena um ou mais caracteres
        //			reference data type tem acesso a diversos methods


        java.lang.String nome = "Igor";

        // method equals compara a string com a referência e retorna um valor boolean, sem o IgnoreCase ele vai ser CamelCase Sensitive
        // boolean resultado = nome.equalsIgnoreCase("igor"); // o resultado aqui é verdadeiro

        // method lenght retorna o tamanho quantitativo de caracteres, serve para contar arrays também
        //int resultado = nome.length(); // o resultado é 4

        // method charAt retorna a letra conforme sua posição sendo 0 = primeira letra, 1 = segunda letra
        //char resultado = nome.charAt(0); // o resultado é I

        // method indexOf faz o contrario do charAt, ele verifica em que posição a letra está
        //int resultado = nome.indexOf("g"); // o resultado é 1

        // method isEmpty verifica se a variavél tem algum valor e retorna boolean
        // boolean resultado = nome.isEmpty(); // o resultado é falso

        // method toUpperCase faz com que os caracteres da variável apontada fiquem todos em caixa alta
        // String resultado = nome.toUpperCase(); // o resultado é IGOR

        // method toLowerCase faz o contrario do toUpperCase
        // String resultado = nome.toLowerCase(); // o resultaado é igor

        // method trim vai limpar todos os espaços vazios antes e depois da variável, não irá apagar no meio (ufa...)
        // String resultado = nome.trim(); // o resultado é Igor

        // method replace irá substituir os caracteres referenciados na variavel por outros caracteres
        java.lang.String resultado = nome.replace("o", "a"); // o resultado é Igar

        // se você digitar o nome da variável String mais o ponto vai aparecer uma lista de methods que podem ser usados.
        // ex.:


        System.out.println(resultado);
    }
}
