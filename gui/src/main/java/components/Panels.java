package components;

import javax.swing.*;
import java.awt.*;

public class Panels {

    public void execute() {
        // Jpanel = um componente GUI que tem a função de um container que contém outros componentes

        ImageIcon icon = new ImageIcon("ggg.png");
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(100, 50,  Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);

        JLabel label = new JLabel();
        label.setText("HI");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 75, 75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        redPanel.add(label);
        bluePanel.add(label);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }

}