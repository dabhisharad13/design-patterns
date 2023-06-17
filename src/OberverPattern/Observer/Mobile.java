package OberverPattern.Observer;

import OberverPattern.State.Message;

public class Mobile implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Mobile - " + message.messageContent());
    }
}
