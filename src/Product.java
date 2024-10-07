abstract public class Product {
    private String name;
    private double price;
    private String productId;


    public Product(String name, double price, String productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return name + " ID: " + productId;
    }
}
