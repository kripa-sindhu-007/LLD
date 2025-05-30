package SOLIDPrinciples.DIP.GoodCode;

public class NotificationService {

    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel channel){
        this.notificationChannel = channel;
    }

    public void sendMsg(String message){
        notificationChannel.send(message);
    }
}
