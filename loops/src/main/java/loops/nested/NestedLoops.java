package loops.nested;

import java.util.Scanner;

public class NestedLoops {

    public void execute() {
        // Nested loops é um loop dentro de um outro loop

        Scanner scanner = new Scanner(System.in);

        int contagem = 0;
        int linha;
        int coluna;

        System.out.println("Digite o número de linhas: ");
        linha = scanner.nextInt();
        System.out.println("Digite o número de colunas: ");
        coluna = scanner.nextInt();

        for(int i = 1; i<=linha; i++) {
            System.out.println();
            for (int j = 1; j<=coluna; j++) {
                System.out.print("|" + (j+contagem) + "|");
            }
            contagem = coluna + contagem;
        }

        // explicação: foi criado um for loop para reproduzir as linhas com um sysout.println(pois as linhas vão ser puladas após a conclusão
        // dentro desse loop da linha, existe um loop de coluna que vai reproduzir na mesma linha o conteudo proposto

    }
}
