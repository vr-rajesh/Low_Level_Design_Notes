package FactoryDesignPattern.FactoryMethod;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat Sound");
    }
}
