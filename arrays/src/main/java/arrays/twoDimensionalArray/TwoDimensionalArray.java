package arrays.twoDimensionalArray;

public class TwoDimensionalArray {

    public void execute() {

        // 2D arrays são tabelas de elementos onde usasse como referência linhas e colunas, similar uma planilha

        /* A estrutura para a criação de um 2D array é:
         *         DataType[linha][coluna] V = new DataType[qtd][qtd]      	  */
        String[][] carros = new String[3][3];
        int contagem = 0;

        carros[0][0] = "Camaro";
        carros[0][1] = "Corvette";
        carros[0][2] = "Tesla";
        carros[1][0] = "Silverado";
        carros[1][1] = "Mustang";
        carros[1][2] = "Corsa";
        carros[2][0] = "Palio";
        carros[2][1] = "F-150";
        carros[2][2] = "ferrari";


        for(int i = 0; i<carros.length; i++) {

            for(int j = 0; j<carros[i].length; j++) {

                System.out.print((contagem + j) + " - "+carros[i][j]+" | ");

            }
            System.out.println();
            contagem = contagem + carros[i].length;
        }

        //Existe outra forma de colocar um valor em um 2D array

        String[][] frutas = {{"maça","banana"},{"goiaba","kiwi"}};
    }
}
