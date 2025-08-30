package keywords._static;

public class Static {

    public void execute() {
        // static = atributo. Uma única copia de uma variável/method é criado e compartilhado
        //			A classe possui um membro static


        Friend friend1 = new Friend("Sponegbob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        Friend.displayFriends();

        //Math.round(); // o round é um method static, por exemplo.

        // se ele não fosse, a sintax seria assim:
        // Math math = new Math();
        // Math.round();

        // por ele ser static, ele já é chamado automaticamente sem a necessidade de criar um objeto
    }
}
