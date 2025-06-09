package BehaviouralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

//Observer Interface
interface Observer{
    void update(float temp);
}

//Subject Interface
interface Subject{
    void add(Observer obs);

    void remove(Observer obs);

    void notifyObservers();

}

//Weather Station

class Weather implements Subject{

    private float temperature;

    private final List<Observer> observerList;

    Weather(){
        observerList = new ArrayList<>();
    }

    public void setTemperature(float temp){
        this.temperature = temp;
        notifyObservers();
    }

    @Override
    public void add(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void remove(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs : observerList){
            obs.update(temperature);  // runtime poly....as every obs will have its own implementation
        }

    }
}

class LargeScreen implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Temp on Large Screen is: " + temp);
    }
}

class MediumScreen implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Temp on Medium Screen is: " + temp);
    }
}

class SmallScreen implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Temp on Small Screen is: " + temp);
    }
}
public class ObserverPattern {
    public static void main(String[] args){
        // Publisher
        Weather weather = new Weather();

        // Subscriber
        LargeScreen largeScreen = new LargeScreen();
        MediumScreen mediumScreen = new MediumScreen();
        SmallScreen smallScreen = new SmallScreen();

        // Add to the observer list;
        weather.add(largeScreen);
        weather.add(mediumScreen);
        weather.add(smallScreen);

        //Set the temperature
        weather.setTemperature(25.8F);

        System.out.println("================================================");

        // Remove from the observer lis t
        weather.remove(largeScreen);

        weather.setTemperature(30.2F);
    }

}
