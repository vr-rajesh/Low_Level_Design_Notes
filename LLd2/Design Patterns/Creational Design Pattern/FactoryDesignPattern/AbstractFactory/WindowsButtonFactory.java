package FactoryDesignPattern.AbstractFactory;

public class WindowsButtonFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
