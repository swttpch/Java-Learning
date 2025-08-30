package files.fileWriter;

import java.io.IOException;

public class FileWriter {

    public void execute() {

        try {
            java.io.FileWriter writer = new java.io.FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nI don't know what to say \nBut i know that i love you");
            writer.append("\n(A poem by Igor)");
            writer.close(); //garanta que você feche o objeto quando terminar
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}