package core.constructor;

public class Constructor {

    public void execute(String[] args) {
        Human human1 = new Human("Igor", 21, 60);
        Human human2 = new Human("Kamilly", 14, 40);

        human2.eat();
        human1.drink();

    }
}
