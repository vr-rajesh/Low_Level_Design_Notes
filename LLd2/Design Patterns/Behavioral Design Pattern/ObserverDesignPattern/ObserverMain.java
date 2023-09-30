package ObserverDesignPattern;

public class ObserverMain {

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        TemperatureDisplay display1 = new TemperatureDisplay("Watch");
        TemperatureDisplay display2 = new TemperatureDisplay("Monitor");

        sensor.addObserver(display1);
        sensor.addObserver(display2);

        sensor.generateTemperature();
        sensor.generateTemperature();
        sensor.generateTemperature();
    }
}

 /*   The Observer Design Pattern is a behavioral design pattern used in Java
        (and other object-oriented languages) to define a one-to-many dependency
        between objects so that when one object (the subject) changes state, all
        its dependents (observers) are notified and updated automatically. This
        pattern is often used in implementing distributed event handling systems,
        in building model-view-controller architectures, and in various other scenarios
        where you need to maintain consistency between related objects.*/
