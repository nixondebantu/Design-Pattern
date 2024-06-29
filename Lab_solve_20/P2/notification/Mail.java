package P2.notification;

public class Mail implements Notification{

    @Override
    public String sendNotification(String notificationTxt) {
        return "Mail: "+ notificationTxt;
    }

}
