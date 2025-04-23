package Interface;

public class Main {
    public static void main(String[] args) {
        NotificationService notification = new PushNotification();
        notification.sendNotification("sending push notification");
        NotificationService email = new EmailNotification();
        email.sendNotification("receiving email notification");
        NotificationService sms = new SMSNotification();
        sms.sendNotification("receiving SMS notification");

    }
}

