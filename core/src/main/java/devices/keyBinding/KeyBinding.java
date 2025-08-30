package devices.keyBinding;

public class KeyBinding {

    public void execute() {

        // Key Binding =	liga uma ação a uma "KeyStroke"
        //					não precisa que você clique em um componte para dar foco à ele
        //					todos os componentes Swing usam Key Binding
        // 					comparado ao *KeyListener, é mais flexível
        //					pode assinar uma key strokes para um componente Swing individual
        // 					mais dificil de utilizar e de definir

        new Game();

    }

}