package oops;

public class UPI implements PaymentMethod{

    String upiID;

    UPI(String upiID){
        this.upiID=upiID;
    }

    @Override
    public void pay(){
        System.out.println("Making payment through UPI !! " + upiID);
    }
}
