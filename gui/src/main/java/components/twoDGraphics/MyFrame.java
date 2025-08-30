package components.twoDGraphics;

import javax.swing.*;

class MyFrame extends JFrame{

    MyPanel panel;

    MyFrame(){

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        this.add(panel);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }


}