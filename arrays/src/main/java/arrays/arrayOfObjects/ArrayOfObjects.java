package arrays.arrayOfObjects;

public class ArrayOfObjects {

    public void execute() {

        System.out.println("Método #1 : ");
        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Butter");
        Food food2 = new Food("Jelly");
        Food food3 = new Food("Soda");
        Food food4 = new Food("Beef");
        Food food5 = new Food("Sugar");
        Food food6 = new Food("Bread");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        for (Food food : refrigerator) {
            System.out.println(food.name);
        }

        System.out.println("Método #2 : ");
        Food[] pantry = {food4, food5, food6};

        for(Food food : pantry){
            System.out.println(food.name);
        }
    }
}
