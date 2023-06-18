package CreationalPatterns.FactoryPattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmailNotification implements Notification {

    private final Message message;

    @Override
    public void userNotification() {
        System.out.println("Email Notificaion : " + message.message());
    }
}
