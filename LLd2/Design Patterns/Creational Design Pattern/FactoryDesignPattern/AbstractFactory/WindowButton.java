package FactoryDesignPattern.AbstractFactory;

public class WindowButton implements Button{
    @Override
    public void paint() {
        System.out.println("Windows Button Paint");
    }
}
