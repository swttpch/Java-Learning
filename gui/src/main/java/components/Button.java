package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame implements ActionListener {

    JButton btn;
    JLabel lbl;


    Button(){

        ImageIcon icon = setIcon("dude.png", 100, 100);

        lbl = new JLabel();
        lbl.setBounds(150, 250, 150, 150);
        lbl.setIcon(icon);
        lbl.setVisible(false);

        btn = new JButton();
        btn.setBounds(100, 100, 250, 100);
        btn.addActionListener(this);
        btn.setText("Show the dude");
        btn.setFocusable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(btn);
        this.add(lbl);


    }

    ImageIcon setIcon(String imgName, int width, int height){

        ImageIcon icon = new ImageIcon(imgName);
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(width, height,  Image.SCALE_SMOOTH);
        return icon = new ImageIcon(newimg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (!lbl.isVisible()){
            if (e.getSource()==btn){
                System.out.println("Here is the dude");
                lbl.setVisible(true);
                btn.setText("Hide the dude");
            }
        } else {
            if (e.getSource()==btn){
                System.out.println("Hiding the dude");
                lbl.setVisible(false);
            }
        }

    }


}
