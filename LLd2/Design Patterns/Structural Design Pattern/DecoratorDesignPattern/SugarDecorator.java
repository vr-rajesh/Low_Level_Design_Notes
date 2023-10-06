package DecoratorDesignPattern;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffeeDecorator) {
        super(coffeeDecorator);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ",with Sugar";
    }

    @Override
    public int cost() {
        return super.cost() + 5;
    }
}
