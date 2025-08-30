package components.gui;

public class GUI {

    public void execute() {

        // JFrame = a GUI window to add components to

		/*
		JFrame frame = new JFrame(); // cria um frame

		frame.setTitle("JFrame title goes here"); // define o titulo do frame

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Permite parar de rodar o programa quando fechado

		frame.setResizable(false); // não permitir modificar o frame

		frame.setSize(420, 420); // define a largura e altura

		frame.setVisible(true); // fazer o frame ficar vísivel

		ImageIcon image = new ImageIcon("logo.jpg"); // vai criar um icone da imagem

		frame.setIconImage(image.getImage()); // vai definir a imagem de icone

		frame.getContentPane().setBackground(new Color(123, 50, 250)); // define a cor de fundo */

        MyFrame myframe = new MyFrame(); // não precisa de um nome, colocar o "MyFrame myframe =" é opcional
    }

}