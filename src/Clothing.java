public class Clothing extends Product{
    private String size;

    public Clothing(String name, double price, String productId, String size) {
        super(name, price, productId);
        this.size = size;
    }
}
