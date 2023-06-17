package OberverPattern.Observer;

import OberverPattern.State.Message;

public interface Observer {
    void update(Message message);
}