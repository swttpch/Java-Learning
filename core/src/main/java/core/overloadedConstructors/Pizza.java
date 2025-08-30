package core.overloadedConstructors;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
        System.out.println(this.bread + "\n" + this.sauce + "\n" + this.cheese + "\n" + this.topping);
		/*System.out.println(this.bread);
		System.out.println(this.sauce);
		System.out.println(this.cheese);
		System.out.println(this.topping);*/
    }

    Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        System.out.println(this.bread + "\n" + this.sauce + "\n" + this.cheese);
		/* System.out.println(this.bread);
		System.out.println(this.sauce);
		System.out.println(this.cheese); */
    }

    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
        System.out.println(this.bread + "\n" + this.sauce);
		/* System.out.println(this.bread);
		System.out.println(this.sauce); */
    }

    Pizza(String bread){
        this.bread = bread;
        System.out.println(this.bread);
    }

    Pizza(){
        System.out.println("Pizza de vento");
    }

}
