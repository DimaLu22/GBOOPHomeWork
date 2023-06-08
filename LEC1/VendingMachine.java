import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(double price){
        for (Product product : products){
            if (product instanceof Product){
                if (((Product)product).getPrice()  == price){
                    return (Product)product;
                }
            }
        }
        return null;
    }

}
