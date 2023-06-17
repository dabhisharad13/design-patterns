package BehavioralPatterns.OberverPattern.Observer;

import BehavioralPatterns.OberverPattern.State.Message;

public interface Observer {
    void update(Message message);
}