package components;

//O import aqui é de um componente de Interface do usuario padrão do java

import javax.swing.*;

public class Intro {

    public void execute() {

        String nome = JOptionPane.showInputDialog("Coloque seu nome");
        JOptionPane.showMessageDialog(null, "Olá " + nome);
        /* Foi criada uma variável de nome "nome" que vai receber o que você digitar na caixa de dialogo
         * A caixa de dialogo vem do JOptionPane
         * .showInputDialog é para aparecer essa caixa de dialogo juntamente com o ()
         * que é a mensagem de solicitação */

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Coloque sua idade"));
        JOptionPane.showMessageDialog(null, "Sua idade é " + idade + " anos");
        /* Aqui acontece a mesma coisa do código anterior, contudo aqui tem uma conversão do valor
         * O comando Integer.parseInt pega o valor atribuido na caixa de dialogo -que é string
         * e converte em integer, pois a variavel "idade" é integer! */

        double tamanho = Double.parseDouble(JOptionPane.showInputDialog("Coloque sua altura"));
        JOptionPane.showMessageDialog(null, "Sua altura é " + tamanho + " cm");
        /* Aqui ocorre uma conversão também, só que para o tipo de data double*/

    }

}