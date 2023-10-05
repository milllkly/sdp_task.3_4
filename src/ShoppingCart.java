import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
    }

    public void checkout(PaymentStrategy paymentMethod) {
        double amount = calculateTotal();
        paymentMethod.processPayment(amount);
    }
}
