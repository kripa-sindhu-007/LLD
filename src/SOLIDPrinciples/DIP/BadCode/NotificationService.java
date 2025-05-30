package SOLIDPrinciples.DIP.BadCode;

public class NotificationService {

    private EmailService emailService;
    private SMSService smsService;   //obj reference is done here

    public NotificationService(){
        this.emailService = new EmailService();   //obj is initialized here
        this.smsService = new SMSService();
    }

    public void notifyByEmail(String message){
        emailService.sendEmail(message);
    }

    public void notifyBySMS(String message){
        smsService.sendSMS(message);
    }
}
