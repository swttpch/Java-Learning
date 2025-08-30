package devices.mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrame extends JFrame implements MouseListener{

    JLabel label;
    ImageIcon icone;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);


        icone = setIcon("sleep.png", 300, 300);

        label = new JLabel();
        label.setBounds(90,75,300,300);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setIcon(icone);
        label.addMouseListener(this);
        this.addMouseListener(this);

        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }

    ImageIcon setIcon(String imgName, int width, int height){
        ImageIcon icon = new ImageIcon(imgName);
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(width, height,  Image.SCALE_SMOOTH);
        return icon = new ImageIcon(newimg);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // ativado quando um botão do mouse é clicaco ("liberado" e pressionado)em um componente
        //System.out.println("you clicked the mouse");

        icone = setIcon("eyesup.png", 300, 300);
        label.setIcon(icone);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // ativado quando o mouse é pressionado sobre o componente
        //System.out.println("you pressed the mouse");
        //label.setBackground(Color.blue);

        icone = setIcon("pain.png", 300, 300);
        label.setIcon(icone);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // ativado quando o mouse é solta por cima do componente
        //System.out.println("you released the mouse");
        //label.setBackground(Color.green);

        icone = setIcon("eyesup.png", 300, 300);
        label.setIcon(icone);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // ativado quando o mouse entra na area do componente
        //System.out.println("you entered the component");
        //label.setBackground(Color.magenta);
        icone = setIcon("sleepy.png", 300, 300);
        label.setIcon(icone);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // ativado quando um mouse sai de um componente
        //System.out.println("you exited the component");
        //label.setBackground(Color.black);

        icone = setIcon("sleep.png", 300, 300);
        label.setIcon(icone);
    }
}