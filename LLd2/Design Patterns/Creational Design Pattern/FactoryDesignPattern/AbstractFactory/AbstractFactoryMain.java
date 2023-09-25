package FactoryDesignPattern.AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsButtonFactory();
        Button button = factory.createButton();
        button.paint();
    }
}

   /* The Abstract Factory is another variation of the Factory Design Pattern that provides an interface for creating
        families of related or dependent objects without specifying their concrete classes.
        It's used when you need to ensure
        that the created objects are compatible with each other.*/
