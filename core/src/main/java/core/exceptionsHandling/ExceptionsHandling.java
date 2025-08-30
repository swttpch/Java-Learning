package core.exceptionsHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsHandling {

    public void execute() {
        // exceptions = eventos que ocorrem no decorrer da execução de um programa que,
        //   			que interrompe o fluxo normal de instruções
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result is " + z);
        }
        catch(ArithmeticException e) {
            System.out.println("you can't divide by zero! idiot!");
        }
        catch(InputMismatchException e) {
            System.out.println("enter a number...");
        }
        catch(Exception e) {
            System.out.println("qualquer outro erro");
        }
        finally {
            scanner.close();
        }

    }

}