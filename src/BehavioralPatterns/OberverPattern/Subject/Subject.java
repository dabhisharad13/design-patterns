package BehavioralPatterns.OberverPattern.Subject;

import BehavioralPatterns.OberverPattern.Observer.Observer;
import BehavioralPatterns.OberverPattern.State.Message;

public interface Subject {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notify(Message message);
}
