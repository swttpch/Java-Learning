package components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {

    public void execute() {
        //

        ImageIcon imageI = new ImageIcon("ggg.png"); // escolhe a icone a partir das imagems do projeto
        Image image = imageI.getImage(); // recolhe o icone para uma imagem para edita-lá
        Image newimg = image.getScaledInstance(250, 132,  Image.SCALE_SMOOTH); //redimensiona a imagem junto com uma escala suave
        imageI = new ImageIcon(newimg); // pega a imagem e atribui ao icone

        Border border = BorderFactory.createLineBorder(Color.green, 3); // cria uma borda

        JLabel label = new JLabel(/*"Mensagem do label 1"*/); //	cria o label
        label.setText("JOIA!"); 				  // 	define o texto do label

        label.setHorizontalTextPosition(JLabel.CENTER); // deixa o text no LEFT, CENTER OR RIGHT do icone
        label.setVerticalTextPosition(JLabel.TOP); // deixa o texto no TOP, CENTER OR BOTTOM do icone

        label.setIcon(imageI); // coloca o icone no label

        label.setForeground(Color.green);     // define a cor da fonte
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); // define a fonte do texto

        label.setIconTextGap(0); // define o espaço entre a imagem e o texto

        label.setBackground(Color.BLACK); //muda a cor de fundo
        label.setOpaque(true); //tira a opacidade do background

        label.setBorder(border); // define a borda

        label.setVerticalAlignment(JLabel.CENTER); // define a posição vertica de todo label
        label.setHorizontalAlignment(JLabel.CENTER); // define a posição horizontal de todo label

        //label.setBounds(JLabel.CENTER, JLabel.CENTER, 300, 300); // define a posição y e x sob o frame assim como as dimensões

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(420, 420);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label); // coloca o label no frame // use antes do frame.pack(); !!!!
        frame.pack();



    }

}