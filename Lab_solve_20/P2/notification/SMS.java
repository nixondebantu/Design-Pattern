package P2.notification;

public class SMS implements Notification{

    @Override
    public String sendNotification(String notificationTxt) {
        return "SMS: "+notificationTxt;
    }

}
