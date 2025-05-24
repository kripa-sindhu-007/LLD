package SOLIDPrinciples.BadCode;

public class Invoice {

    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated for amount: "+ amount);
    }

    public void saveToDatabase(){
        System.out.println("Saving invoice to Database...");
    }

    public void sendEmailNotification(){
        System.out.println("Sending Email notification for invoice...");
    }

}
