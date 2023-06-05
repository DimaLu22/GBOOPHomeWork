

public class eatscats {

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];

        cat[0] = new Cat("Barsik", 100);
        cat[1] = new Cat("Murzik", 80);
        cat[2] = new Cat("Marusia", 60);

        Plate plate = new Plate(230);

        System.out.println("You have three cats: " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName() + "");
        System.out.println(+ plate.getFood() + " grams in plate \n");

        for (Cat i : cat) {
            if (!plate.checkFood(i.getAppetite())) {
                plate.increaseFood();
                }
                i.eat(plate);
                    System.out.println("Cat " + i.getName() + " eats " + i.getAppetite() + " grams ");
        }
         System.out.println(+ plate.getFood() + " grams left in the plate\n");
    }
} 