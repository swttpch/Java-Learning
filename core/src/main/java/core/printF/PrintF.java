package core.printF;

public class PrintF {

    public void execute() {
        // printf() = um method de controle opcional para controlar, formatar ou mostrar textos na tela do console
        // 			  usasse dois argumentos que são o formato string + (objeto/variavel/valor)
        //			  % [flags] -> [precision] -> [width] -> [conversion-character]

        //System.out.printf("Isso é um formato String %d",123); // independente de onde você colocar o %d, entre áspas, claro, ele vai ficar

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Igor";
        int myInt = 50;
        double myDouble = -1000;

        // [conversion-character]
        //System.out.printf("%b", myBoolean);
        //System.out.printf("%c",myChar);
        //System.out.printf("%s",myString);
        //System.out.printf("%d",myInt);
        //System.out.printf("%f",myDouble);

        // [width]
        // tamanho minimo de caracteres que vai ser escrito como output
        //System.out.printf("Hello %-10s", myString); // como a palavra igor só tem 4 caractere, o width adiciona mais 6 pra completar o minimo de 10
        // caso o número seja negativo, o numero de casas vem depois da palavra, positivo vem antes

        // [precision]
        // define o numero de precisão de digitos quando o valor é float (decimal); quantidade de casas decimais
        //System.out.printf("Você tem %.2f reais", myDouble); // a estutura é %.2f para adicionar só duas casas decimais.

        // [flags]
        // adiciona efeitos no output baseado no formato de flag especificado
        // - : left-justify
        // + : output um mais(+) ou um  menos (-) sinal para o número, conforme o valor da variavel
        // 0 : valor numerico com 0 adicionais antes do numero
        // , : separação de milhar

        System.out.printf("Você tem %,.2f reais", myDouble);
    }

}