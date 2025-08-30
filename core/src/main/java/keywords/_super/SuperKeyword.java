package keywords._super;

public class SuperKeyword {

    public void execute() {
        // super = referencia a superclass (classe pai) de um objeto
        // bem parecido com a "this" keyword

        Hero hero1 = new Hero("Flash",25,"Supervelocidade");
        Hero hero2 = new Hero("Superman",45,"Tudo");
        Hero hero3 = new Hero("Batman",43,"$$$$$");


        System.out.println(hero2.toString());
    }
}
