package FactoryDesignPattern.AbstractFactory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Mac Button Paint");
    }
}
