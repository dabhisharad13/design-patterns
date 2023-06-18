package CreationalPatterns.FactoryPattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SmsNotification implements Notification {

    private final Message message;

    @Override
    public void userNotification() {
        System.out.println("SMS Notificaion : " + message.message());
    }
}
