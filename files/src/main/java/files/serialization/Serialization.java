package files.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public void execute() throws IOException {

        /*
                Steps to Serializate:
                ----------------------------------------------------
                1 - Your object class should implement Serializable Interface
                2 - add import java.io.Serializable;
                3 - FileOutputStream fileOut = new FileOutputStream(file path)
                4 - ObjectOutputStream out = new ObjectOutputStream(fileOut)
                5 - out.writeObject(objectName);
                6 - out.close(); fileOut.close();
         */


        User user = new User();

        user.name = "Igor Gomes";
        user.password = "hypn0s123";

        FileOutputStream fileOut = new FileOutputStream("User info.ser");


        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);

        out.close();
        fileOut.close();

        System.out.println("Object info save!");

    }

}
