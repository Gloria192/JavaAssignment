package Interface;

public class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
        }

class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}
class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}








