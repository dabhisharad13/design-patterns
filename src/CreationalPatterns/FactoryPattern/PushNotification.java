package CreationalPatterns.FactoryPattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PushNotification implements Notification {

    private final Message message;

    @Override
    public void userNotification() {
        System.out.println("Push Notification : " + message.message());
    }
}
