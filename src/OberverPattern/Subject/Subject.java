package OberverPattern.Subject;

import OberverPattern.Observer.Observer;
import OberverPattern.State.Message;

public interface Subject {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notify(Message message);
}
