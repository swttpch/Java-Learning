package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


public class DragPanel extends JPanel{

    ImageIcon image = setIcon("pain.png", 100,100); // seleciona a imagem

    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner; // cria dois objetos, um para a area da imagem e outro para  "ponto anterior"
    Point prevPt;

    DragPanel(){

        imageCorner = new Point(0, 0); // define o ponto inicial da imagem
        ClickListener clickListener = new ClickListener(); // instância a classe para "ouvir" os clicks
        DragListener dragListener = new DragListener(); // instância a classe para "soltar" o click
        this.addMouseListener(clickListener); // adiciona o objeto clickListener juntamente ao method MouseListener
        this.addMouseMotionListener(dragListener);  // adiciona o objeto dragListener juntamente ao method MotionListener
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g); // atraves do super, chama o method paintComponent
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY()); // atualiza o icone conforme
        // sua posição

    }

    private class ClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint(); // recolhe o valor do mouse onde estava
        }

    }

    private class DragListener extends MouseMotionAdapter{

        public void mouseDragged(MouseEvent e) {

            Point currentPt = e.getPoint(); // novo objeto que vai capturar o ponto atual

            imageCorner.translate( // traduzir

                    (int)(currentPt.getX() - prevPt.getX()), // atualiza o ponto antigo com o novo ponto

                    (int)(currentPt.getY() - prevPt.getY()) // mesma coisa

            );
            prevPt = currentPt; // recolhe o valor
            repaint(); // lança o PaintComponent
        }

    }

    public ImageIcon setIcon(String imgName, int width, int height){
        ImageIcon icon = new ImageIcon(imgName);
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(width, height,  Image.SCALE_SMOOTH);
        return icon = new ImageIcon(newimg);
    }

}