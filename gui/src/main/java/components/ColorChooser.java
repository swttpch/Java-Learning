package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser extends JFrame implements ActionListener {

    JButton btn1, btn2;
    JLabel lbl;

    ColorChooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        btn1 = new JButton("Pick a color for foreground");
        btn2 = new JButton("Pick a color for background");
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        lbl = new JLabel();
        lbl.setBackground(Color.white);
        lbl.setOpaque(true);
        lbl.setText("CHANGE THE COLOR");
        lbl.setFont(new Font("MV Boli", Font.PLAIN,40));

        this.add(btn1);
        this.add(btn2);
        this.add(lbl);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==btn1){
            JColorChooser foreground = new JColorChooser();
            Color color1 = JColorChooser.showDialog(null, "pick a color for foreground", Color.black);
            lbl.setForeground(color1);
        }

        if (e.getSource()==btn2){
            JColorChooser background = new JColorChooser();
            Color color2 = JColorChooser.showDialog(null, "pick a color for background", Color.black);
            lbl.setBackground(color2);
        }

    }
}
