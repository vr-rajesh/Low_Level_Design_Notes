package FacadeDesignPattern;

public class CarFacade {
    private StartEngine startEngine;
    private InjectFuel injectFuel;
    private IgniteEngine igniteEngine;

    public CarFacade() {
        this.startEngine = new StartEngine();
        this.injectFuel = new InjectFuel();
        this.igniteEngine = new IgniteEngine();
    }
    public void startCar(){
        startEngine.start();
        injectFuel.inject();
        igniteEngine.ignite();
    }
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();
    }
}
/*
With the help of facade design pattern we are making the code more understandable and more readable and easy to maintain.
Here we are calling the 3 different subsystem to a main system class making it look cleaner and more readable.
In the startCar() method we are calling the there different method instead of defining everything in the same method

It also provides a high level understanding and it is easy to extend

Facade pattern hides the complexities of the system and provides an interface
to the client using which the client can access the system. This type of design pattern
comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.

This pattern involves a single class which provides simplified methods required by
client and delegates calls to methods of existing system classes.
* */