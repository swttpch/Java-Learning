package com.swttpch.demo.variableScope;

import java.util.Random;

public class DiceRoller {

    Random random;
    int number;

    public DiceRoller(){
        random = new Random();
        execute();
    }

    public void execute(){
        roll();
        printNumber();
    }

    private void roll(){
        number = random.nextInt(6)+1;
    }

    private void printNumber(){
        System.out.println(number);
    }
}
