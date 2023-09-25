package FactoryDesignPattern.FactoryMethod;

public class CatFactory implements IAnimalFactory {
    @Override
    public Animal makeAnimal() {
        return new Cat();
    }
}
