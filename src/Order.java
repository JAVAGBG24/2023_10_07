import java.util.HashMap;
import java.util.Map;

public class Order {
    private String orderId;
    private Map<Product, Integer> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new HashMap<>();
    }

    // lägga till
    public void addProduct(Product product, int quantity) {
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    //ta bort
    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Product " + product + " has been removed.");
    }

    // summera hela ordern
    public void displayOrderDetails() {
        System.out.println("Order id " + orderId);
        System.out.println("Products in order: ");
        double total = 0;

        for(Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            double productTotal = product.getPrice() * quantity;
            total += productTotal;
            System.out.println(product + " x " + quantity + " Total amount: " + productTotal);
        }
        System.out.println("Total amount for order: " + total);
    }
}














