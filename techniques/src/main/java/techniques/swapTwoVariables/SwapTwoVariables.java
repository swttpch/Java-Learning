package techniques.swapTwoVariables;

public class SwapTwoVariables {

    public void execute() {

        //transferir um valor de uma váriavel para outra
        //basta criar uma variável vazia e fazer o Swap

        String x = "Água";
        String y = "Suquinho";
        String temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("Depois da troca fica: ");

        temp = x; //temp recebe x, então temp = "Água" ; x = "Água" ; y = "Suquinho"

        x = y; // x recebe y, então temp = "Água" ; x = "Suquinho" ; y = "Suquinho"

        y = temp; // y recebe temp, então temp = "Água" ; x = "Suquinho" ; y = "Água"

        System.out.println("x: "+x);
        System.out.println("y: "+y);

    }
}
