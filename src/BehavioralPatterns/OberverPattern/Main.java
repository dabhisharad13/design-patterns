package BehavioralPatterns.OberverPattern;

import BehavioralPatterns.OberverPattern.Observer.Desktop;
import BehavioralPatterns.OberverPattern.Observer.Mobile;
import BehavioralPatterns.OberverPattern.State.Message;
import BehavioralPatterns.OberverPattern.Subject.StocksAPI;
import BehavioralPatterns.OberverPattern.Subject.WeatherAPI;

public class Main {

    public static void main(String[] args) {
        //Subject
        StocksAPI stocksAPI = new StocksAPI();
        WeatherAPI weatherAPI = new WeatherAPI();

        //Observer
        Mobile mobile = new Mobile();
        Desktop desktop = new Desktop();

        //Observer subscribing to Subject.
        stocksAPI.subscribe(mobile);
        stocksAPI.subscribe(desktop);
        weatherAPI.subscribe(mobile);
        weatherAPI.subscribe(desktop);

        //Subject notifying their observers with new data.
        stocksAPI.notify(new Message("New Stock Data Available"));
        weatherAPI.notify(new Message("New Weather Data Available"));
    }
}
