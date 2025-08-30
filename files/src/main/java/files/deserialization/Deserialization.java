package files.deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Deserialization {

    public void execute() throws IOException, ClassNotFoundException {
        /*
                Steps to Deserialization
                ---------------------------------------
                1 - Declare your object (don't instantiate)
                2 - Your class should implement Serializable interface
                3 - add import java.io.Serializable;
                4 - FileInputStream fileIn = new FileInputStream(file path);
                5 - ObjectInputStream in = new ObjectInputStream(fileIn);
                6 - *ObjectName = (Class) in.readObject();
                7 - in.close(); fileIn.close();
         */

        User user = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\Sou Proa\\IdeaProjects\\Serialization\\User info.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        user = (User) in.readObject();

        in.close(); fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);

        user.sayHello();
    }
}
