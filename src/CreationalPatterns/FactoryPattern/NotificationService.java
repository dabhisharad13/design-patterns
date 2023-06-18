package CreationalPatterns.FactoryPattern;

public class NotificationService {

    public static void main(String[] args) {
        //message generation
        Message message = new Message("Reports are generated");

        //factory object
        NotificationFactory notificationFactory = new NotificationFactory();

        //generate a particular service object
        Notification smsNotification = notificationFactory.createNotification("SMS", message);
        Notification emailNotification = notificationFactory.createNotification("Email", message);

        //use the service object
        smsNotification.userNotification();
        emailNotification.userNotification();
    }
}
