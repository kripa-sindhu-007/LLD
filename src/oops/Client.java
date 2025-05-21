package oops;

public class Client {

    public static void main (String [] args){
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("KripaDebitCard",new DebitCard("123","kripa"));
        ps.addPaymentMethod("KripaCreditCard",new CreditCard("321","kripa"));
        ps.addPaymentMethod("KripaUPI",new UPI("111"));

        ps.makePayment("KripaUPI");
        ps.makePayment("KripaDebitCard");
    }
}
