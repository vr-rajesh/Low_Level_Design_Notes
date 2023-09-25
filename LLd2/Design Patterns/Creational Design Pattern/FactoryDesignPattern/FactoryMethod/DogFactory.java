package FactoryDesignPattern.FactoryMethod;

public class DogFactory implements IAnimalFactory{
    @Override
    public Animal makeAnimal() {
        return new Dog();
    }
}
