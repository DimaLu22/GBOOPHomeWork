import java.util.ArrayList;

public class Box<T extends Fruit> {
   private ArrayList<T> fruits;
   private float weight;

   public Box() {
      this.fruits = new ArrayList<>();
   }

   public void add(T fruit){
      fruits.add(fruit);
      weight += fruit.getWeight();
   }

   public double getWeight(){
      return weight;
   }

   public boolean compare(Box <?> box){
      return Double.compare(this.getWeight(), box.getWeight()) == 0;
   }

   public void pour (Box<T> box){
      for(T fruit : fruits) {
         box.add(fruit);
      }
         fruits.clear();
         weight = 0;
   }
}