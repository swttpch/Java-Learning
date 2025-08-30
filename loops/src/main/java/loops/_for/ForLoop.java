package loops._for;

public class ForLoop {

    public void execute() throws InterruptedException {

        // For loop executa um bloco de comando delimitado por uma quantidade de vezes

		/* for(int i = 0; i<=10; i++) { 	// Estrutura - (variavél; delimitador; contagem incrimintada)
			System.out.println(i);   		// contagem decrementada (--)
		} */

        for(int i = 10; i>=0; i--) { // aqui é contagem decrementada contando de 2 em 2, para isso é necessario colocar o = no final do incremento/decremento e a quantidade de numeros que vai pular
            System.out.println(i);
            Thread.sleep(200);
        }

        System.out.println("FELIZ ANO NOVO");

    }

}
