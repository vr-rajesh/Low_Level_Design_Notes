package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TemperatureSensor implements TemperatureObserver{
    private final List<TemperatureDisplay> observers = new ArrayList<>();
    private double currentTemperature;

    public void addObserver(TemperatureDisplay temperatureDisplay){
        observers.add(temperatureDisplay);
    }

    public void removeObserver(TemperatureDisplay temperatureDisplay){
        observers.remove(temperatureDisplay);
    }

    @Override
    public void generateTemperature() {
        Random random = new Random();
        currentTemperature = Math.round(random.nextDouble(30));
        System.out.println("Current Temperature : "+currentTemperature);
        notifyObserver();
    }
    private void notifyObserver(){
        for(TemperatureDisplay observer : observers){
            observer.update(currentTemperature);
        }
    }
}

