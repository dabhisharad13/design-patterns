package OberverPattern.Observer;

import OberverPattern.State.Message;

public class Desktop implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Desktop - " + message.messageContent());
    }
}
