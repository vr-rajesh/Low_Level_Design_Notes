package DecoratorDesignPattern;

public class MainCoffee {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() +":" + coffee.cost());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() +":" + coffee.cost());
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() +":" + coffee.cost());
    }
}


/*
The Decorator design pattern can be used to add the behaviours and responsibility to the objets dynamically in the
run time without changing the existing cod

This design pattern is used when you want to extend the class in the more flexible way

This allows run time modification in more flexible way
Cons
----
We have to create similar objects of objects for all different behaviours

*/
