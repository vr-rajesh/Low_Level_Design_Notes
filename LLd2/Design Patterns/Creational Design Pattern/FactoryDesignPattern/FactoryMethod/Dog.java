package FactoryDesignPattern.FactoryMethod;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog Sound");
    }
}
