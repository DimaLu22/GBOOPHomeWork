public class PackOfSnak extends Product{

    private int weight;
  
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public PackOfSnak(String brand, String name, double price, int weight) {
        super(brand, name, price);
        this.weight = weight;
    }
    
    @Override
    public String displayInfo() {
        return String.format("[Пачка]%s - %s - %f - [Вес: %d]", brand, name, price, weight);
    }
}
