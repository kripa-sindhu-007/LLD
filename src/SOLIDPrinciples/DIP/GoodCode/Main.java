package SOLIDPrinciples.DIP.GoodCode;

import SOLIDPrinciples.DIP.GoodCode.NotificationService;

public class Main {

    public static void main(String[] args){

        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.sendMsg("Your email is here!!");

        NotificationService smsNotification = new NotificationService(new SMSService());
        smsNotification.sendMsg("Your SMS is here!!");
    }
}
