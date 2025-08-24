package main;


import com.swttpch.demo.variableScope.DiceRoller;

public class Main {
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();

        diceRoller.execute();
        diceRoller.execute();
    }
}