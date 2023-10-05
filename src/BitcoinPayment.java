public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin");
    }
}
