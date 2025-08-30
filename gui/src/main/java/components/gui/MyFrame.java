package components.gui;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{

    MyFrame() {

        this.setTitle("Jthis title goes here"); // define o titulo do this

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Permite parar de rodar o programa quando fechado

        this.setResizable(false); // não permitir modificar o this

        this.setSize(420, 420); // define a largura e altura

        this.setVisible(true); // fazer o this ficar vísivel

        ImageIcon image = new ImageIcon("logo.jpg"); // vai criar um icone da imagem

        this.setIconImage(image.getImage()); // vai definir a imagem de icone

        this.getContentPane().setBackground(new Color(123, 50, 250)); // define a cor de fundo
    }

}