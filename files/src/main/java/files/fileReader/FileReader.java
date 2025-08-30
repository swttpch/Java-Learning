package files.fileReader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public void execute() {
        // FileReader = lê o conteúdo de um arquivo como um "stream de caracteres". Um por um
        // 				read() retorna um valor int que contém os valores byte.
        // 				quando read() retorna -1, não existe mais data pra ler


        try {
            java.io.FileReader reader = new java.io.FileReader("art.txt");
            int data = reader.read();
            while(data != -1) {
                System.out.print((char)data); // tenha garantia de não usar o println, mas sim o print
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}