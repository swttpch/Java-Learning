package dynamicPolymorphism;

public class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println("Cat goes *meaw*");
    }
}