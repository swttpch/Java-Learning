package core.randomNumbers;

import java.util.Random;

public class RandomNumbers {

    public void execute() {

        Random random = new Random(); //Não são randoms de verdade, são * pseudorandom numbers *

        int x = random.nextInt(6)+1;
        /* Sem um valor dentro dos parâmetros, o método random vai buscar um valor entre os
         * valores integrais do int. colocando um valor dentro do parâmetro ele vai buscar
         * o valor entre 0 e o número digitado - 1. Para começar do 1, é necessário colocar um +1
         * depois do método */

        double y = random.nextDouble(); //um valor aleatório entre 0 e 1

        boolean z = random.nextBoolean(); // um valor aleatório podendo ser verdadeiro ou falso


        System.out.println(x);
    }
}
