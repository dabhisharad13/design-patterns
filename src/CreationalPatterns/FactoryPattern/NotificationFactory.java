package CreationalPatterns.FactoryPattern;

public class NotificationFactory {

    Notification createNotification(String notificationType, Message message) {
        switch (notificationType) {
            case "SMS":
                return new SmsNotification(message);
            case "Email":
                return new EmailNotification(message);
            case "Push":
                return new PushNotification(message);
            default:
                throw new IllegalArgumentException("Unknown notification type " + notificationType);
        }
    }
}
