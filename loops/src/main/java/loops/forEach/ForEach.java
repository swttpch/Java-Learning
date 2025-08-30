package loops.forEach;

import java.util.ArrayList;

public class ForEach {

    public void execute() {

        // for - each = uma técnica de travessia entre os elementos de um array ou coleção
        //  			menos passos e mais legível
        //				menos flexivél

        //String[] animais = {"gato", "cachorro", "rato", "passaro"};

        ArrayList<String> animais = new ArrayList<String>();

        animais.add("gato");
        animais.add("cachorro");
        animais.add("rato");
        animais.add("passaro");


        for (String i : animais) { // aqui ele diz que para cada elemento da variável animais
            System.out.println(i); // é para o sistema imprimir o elemento
        }
    }

}