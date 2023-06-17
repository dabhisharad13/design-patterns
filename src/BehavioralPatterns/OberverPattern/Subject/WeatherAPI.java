package BehavioralPatterns.OberverPattern.Subject;

import BehavioralPatterns.OberverPattern.Observer.Observer;
import BehavioralPatterns.OberverPattern.State.Message;

import java.util.ArrayList;
import java.util.List;

public class WeatherAPI implements Subject {

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(Message message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
