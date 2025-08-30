package devices.keyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyFrame extends JFrame implements KeyListener{

    JLabel label;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        ImageIcon icone = setIcon("rocket.png", 50, 50);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icone);


        this.add(label);
        this.getContentPane().setBackground(Color.black);
        this.addKeyListener(this);
        this.setLayout(null);
        this.setVisible(true);

    }


    @Override
    public void keyTyped(KeyEvent e) {
        // KeyTyped = é invocado quando uma tecla é apertada. usa KeyChar, char output


        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-4, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-4);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+4);
                break;
            case 'd': label.setLocation(label.getX()+4, label.getY());
                break;

        }


    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyPressed = é invocado quando físicamente uma uma tecla é pressionada. usa Keycode, int output

        switch(e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-4, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-4);
                break;
            case 40: label.setLocation(label.getX(), label.getY()+4);
                break;
            case 39: label.setLocation(label.getX()+4, label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased = chamada a qualquer momento que um botão é "liberto"
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key char: " + e.getKeyCode());
    }

    private ImageIcon setIcon(String imgName, int width, int height){

        ImageIcon icon = new ImageIcon(imgName);
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(width, height,  Image.SCALE_SMOOTH);
        return icon = new ImageIcon(newimg);
    }

}