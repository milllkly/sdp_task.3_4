public class Demo {
    public static void main(String[] args) {
        // Create Products
        Product product1 = new Product("Book", 30, 2);
        Product product2 = new Product("Shirt", 20, 1);

        // Create ShoppingCart and add products
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Checkout with different payment strategies
        cart.checkout(new CreditCardPayment());  // Using Credit Card
        cart.checkout(new PayPalPayment());
        cart.checkout(new BitcoinPayment());
        // Using PayPal
    }
}
