package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class MenuBar extends JFrame implements ActionListener{

    JMenuBar menu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    ImageIcon load;
    ImageIcon save;
    ImageIcon exit;

    MenuBar(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        load = setIcon("folder.png", 25, 25);
        save = setIcon("floopyDisk.png", 25, 25);
        exit = setIcon("door.png", 25, 25);

        menu = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(load);
        exitItem.setIcon(exit);
        saveItem.setIcon(save);

        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f for filemenu
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + E for editmenu
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h for helpmenu
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load in filemenu
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save in filemenu
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit in filemenu

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menu.add(fileMenu);
        menu.add(editMenu);
        menu.add(helpMenu);

        this.setJMenuBar(menu);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==loadItem) {
            System.out.println("* * beep boop * you load a file *");
        } else if (e.getSource()==saveItem) {
            System.out.println("* * beep boop * you save a file *");
        }
        else if (e.getSource()==exitItem) {
            System.exit(0);
        }

    }

    private ImageIcon setIcon(String imgName, int width, int height){

        ImageIcon icon = new ImageIcon(imgName);
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(width, height,  Image.SCALE_SMOOTH);
        return icon = new ImageIcon(newimg);
    }
}