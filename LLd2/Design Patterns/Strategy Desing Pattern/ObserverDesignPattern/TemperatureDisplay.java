package ObserverDesignPattern;

public class TemperatureDisplay {
    private final String displayName;

    public TemperatureDisplay(String displayName) {
        this.displayName = displayName;
    }

    public void update(double currentTemperature){
        System.out.println(displayName + ":" +currentTemperature);
    }


}
