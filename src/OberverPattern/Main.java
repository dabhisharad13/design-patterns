package OberverPattern;

import OberverPattern.Observer.Desktop;
import OberverPattern.Observer.Mobile;
import OberverPattern.State.Message;
import OberverPattern.Subject.StocksAPI;
import OberverPattern.Subject.WeatherAPI;

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
