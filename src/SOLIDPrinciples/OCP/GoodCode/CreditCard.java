package SOLIDPrinciples.OCP.GoodCode;

public class CreditCard implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Making payment via Credit Card of amount: " + amount);
    }
}
