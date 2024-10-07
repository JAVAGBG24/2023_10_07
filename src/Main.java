public class Main {
    public static void main(String[] args) {
       // skapa produkter
        Product laptop = new Electronics("Laptop", 15000, "E001");
        Product tshirt = new Clothing("T-shirt", 199, "C001", "M");

        // skapa en order
        Order order = new Order("O1001");

        order.addProduct(laptop, 1);
        order.addProduct(tshirt, 2);

        // summera order
        order.displayOrderDetails();

        // ta bort en produkt
        order.removeProduct(laptop);

        // summera order
        order.displayOrderDetails();
    }
}