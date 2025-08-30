package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox extends JFrame implements ActionListener {

    JCheckBox checkBox;
    JButton btn;

    Checkbox(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        btn = new JButton();
        btn.setText("submit");
        btn.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I ain't a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 25));

        this.add(btn);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){
            System.out.println(checkBox.isSelected());
        }
    }
}
