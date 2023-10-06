package DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffeeDecorator) {
        super(coffeeDecorator);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ",with Milk";
    }

    @Override
    public int cost() {
        return super.cost() + 10;
    }
}
