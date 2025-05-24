package SOLIDPrinciples.OCP.GoodCode;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        CreditCard creditCard = new CreditCard();
        UPI upi = new UPI();
        processor.processPayment(creditCard, 190.30);
        processor.processPayment(upi,200.90);
    }
}
