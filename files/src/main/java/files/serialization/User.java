package files.serialization;

import java.io.Serializable;

class User implements Serializable {


    String name;
    String password;

    public void sayHello(){
        System.out.println("Hello, " + name);
    }
}
