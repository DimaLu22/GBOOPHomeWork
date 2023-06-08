
public class BottleOfWater extends Product{
    
    private double volume;
    
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume) {
        super(brand, name, price);
        this.volume = volume;
    }
    // public BottleOfWater(String name, double price){
    //     super(name, price);
    // }
    @Override
    public String displayInfo() {
        return String.format("[Бутылка]%s - %s - %f - [ОбЬем: %f]", brand, name, price, volume);
    }
}