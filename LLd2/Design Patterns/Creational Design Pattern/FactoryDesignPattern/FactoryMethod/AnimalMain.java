package FactoryDesignPattern.FactoryMethod;

public class AnimalMain {
    public static void main(String[] args) {
        IAnimalFactory factory = new DogFactory();
        //here subclass will decide which object to be created
        Animal animal = factory.makeAnimal();
        animal.makeSound();

        IAnimalFactory catFactory = new CatFactory();
        Animal catAnimal = catFactory.makeAnimal();
        catAnimal.makeSound();
    }
}

/*
The Factory Design Pattern or Factory method says that just define an interface or abstract class
for creating an object but let the subclass defined which class to initiate

Factory design pattern is used regardless of which object will be passed in the subclass
Real life example is valueOf which converts string to int or double

In factory methods we will give one input and based on the input we will get one subclass object as output out
of multiple subclasses.

Factory Design Pattern
The Factory Design Pattern is a creational design pattern used to create objects without specifying the exact
class of object that will be created. It provides an interface or abstract class for creating objects,
but the specific type of objects is determined by the concrete subclasses. This pattern is useful for
decoupling the client code from the details of object creation.

Factory Method
The Factory Method is a specific implementation of the Factory Design Pattern. It defines an interface
(or an abstract class) with a method for creating objects, but it allows subclasses to implement this
method to produce objects of different types
*/
