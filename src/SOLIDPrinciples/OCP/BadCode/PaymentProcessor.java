package SOLIDPrinciples.OCP.BadCode;

public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount){

        if(paymentMethod.equals("CreditCard")){
            System.out.println("Making payment via Credit Card of amount: "+ amount);
        }

        else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Making payment via Debit Card of amount: "+ amount);
        }

        else if (paymentMethod.equals("UPI")) {
            System.out.println("Making payment via UPI of amount: "+ amount);
        }

        else{
            throw new IllegalArgumentException("Unsupported payment method: "+paymentMethod);
        }
    }
}
