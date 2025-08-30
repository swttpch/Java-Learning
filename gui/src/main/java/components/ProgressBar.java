package components;

import javax.swing.*;
import java.awt.*;


public class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 500);

    ProgressBar(){

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {

        int count = 500;

        while(count>0) {
            bar.setValue(count);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            count-=1;
        }
        bar.setString("U R DEAD");
    }

}