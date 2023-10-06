package DecoratorDesignPattern;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public int cost() {
        return 20;
    }
}
