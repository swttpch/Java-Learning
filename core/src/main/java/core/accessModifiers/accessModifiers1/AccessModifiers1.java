package core.accessModifiers.accessModifiers1;
import core.accessModifiers.accessModifiers2.*;

public class AccessModifiers1 {

    protected String protectedMessage = "This is protected";

    public static void execute() {

        C c = new C(); // se a classe C não for public, você não poderá ter acesso a ela
        System.out.println(c.publicMessage);

        B b = new B();

    }
}
