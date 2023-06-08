public class BottleOfMilk extends Product{
    private double volume;
    private double fatContent;

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, double fatContent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatContent = fatContent;

    }
    
    @Override
    public String displayInfo() {
        return String.format("[Бутылка]%s - %s - %f - [ОбЬем: %f] - [Жирность: %f]", brand, name, price, volume, fatContent);
    }}
