package core.genericClasses;

public class GenericClasses {

    public void execute(){

        MyTClass<Integer, Integer> myInt = new MyTClass<>(1, 9);
        MyTClass<Double, Double> myDouble = new MyTClass<>(3.14, 1.01);
        MyTClass<Character, Character> myChar = new MyTClass<>('@', '$');
        MyTClass<String, Character> myString = new MyTClass<>("Hello", '!');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }
}
