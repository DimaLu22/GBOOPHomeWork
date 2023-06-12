import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Product bottleOfWater1 = new BottleOfWater("Borjomi", "Вода минеральная ж/б", 53, 0.33);
        Product bottleOfWater2 = new BottleOfWater("Borjomi", "Вода минеральная п/б", 71, 0.5);
        Product bottleOfWater3 = new BottleOfWater("Borjomi", "Вода минеральная с/б", 87, 0.5);
        Product bottleOfWater4 = new BottleOfWater("Рычал-Су", "Вода минеральная п/б", 59, 1.0);
        Product bottleOfWater5 = new BottleOfWater("Архыз", "Вода минеральная п/б", 83, 5.0);
        Product bottleOfWater6 = new BottleOfWater("Есентуки", "Вода минеральная Есентуки 17 с/б", 41, 0.45);

        Product bottleOfMilk1 = new BottleOfMilk("Домик в деревне", "Молоко", 76.89, 0.95, 2.5);
        Product bottleOfMilk2 = new BottleOfMilk("Домик в деревне", "Молоко", 124.99, 1.4, 3.4);
        
        Product packOfSnak1 = new PackOfSnak("Русская картошка", "Чипсы со вкусом итальянские томаты", 121.690, 140);
        Product packOfSnak2 = new PackOfSnak("Русская картошка", "Чипсы со вкусом лука", 197.890, 140);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);
        products.add(bottleOfWater5);
        products.add(bottleOfWater6);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(packOfSnak1);
        products.add(packOfSnak2);
        
        VendingMachine vendingMachine = new VendingMachine(products);
        Product productResult = vendingMachine.getProduct(121.69);
        if (productResult != null){
            System.out.println("Вы купили: ");
            System.out.println(productResult.displayInfo());
        }
        else {
            System.out.println("Такого товара нет в автомате.");
        }
    }

}