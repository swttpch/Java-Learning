package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtons extends JFrame implements ActionListener{

    JRadioButton radioButton1;
    JRadioButton radioButton2;
    JRadioButton radioButton3;
    ImageIcon icone1;
    ImageIcon icone2;
    ImageIcon icone3;


    ButtonGroup group;


    RadioButtons(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //------------------------------DEFININDO OS ICONES -----------------------

        ImageIcon icone1 = setIcon("pizza.png", 25,25);

        ImageIcon icone2 = setIcon("hotdog.png", 25,25);

        ImageIcon icone3 = setIcon("hamburger.png", 25,25);

        //-------------------------------------------------------------------------

        radioButton1 = new JRadioButton();
        radioButton1.setText("pizza");
        radioButton1.setFocusable(false);
        radioButton1.addActionListener(this);
        radioButton1.setIcon(icone1);

        radioButton2 = new JRadioButton();
        radioButton2.setText("hotdog");
        radioButton2.setFocusable(false);
        radioButton2.addActionListener(this);
        radioButton2.setIcon(icone2);

        radioButton3 = new JRadioButton();
        radioButton3.setText("hamburger");
        radioButton3.setFocusable(false);
        radioButton3.addActionListener(this);
        radioButton3.setIcon(icone3);

        group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==radioButton1) {
            System.out.println("You order pizza");
        }
        else if(e.getSource()==radioButton2) {
            System.out.println("You order salgado");
        }
        else if(e.getSource()==radioButton3) {
            System.out.println("You order Hamburger");
        }

    }

    static ImageIcon setIcon(String imgName, int width, int height){
        ImageIcon icon = new ImageIcon(imgName);
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(width, height,  Image.SCALE_SMOOTH);
        return icon = new ImageIcon(newimg);
    }

}