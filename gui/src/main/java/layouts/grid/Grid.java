package layouts.grid;


import javax.swing.*;
import java.awt.*;

public class Grid {

    public void execute() {
        // Layout Manager = Define o layout natural dos componentes sem um container

        // Grid Layout = Põe os componentes em grades de celulas
        //				  Cada componente ocupa todo o espaço de uma celula
        // 				  e toda celula tem o mesmo tamanho


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,10,10));

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(new JButton("10"));

        frame.setVisible(true);
    }

}