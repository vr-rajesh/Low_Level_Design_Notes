package StrategyDesignPattern;

public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        PaymentStrategy creditCard = new CreditCardPaymentStrategy(1234567890,1234);
        PaymentStrategy upi = new UPIPaymentStrategy(123456,1234);

        cart.getPaymentStrategy(creditCard);
        cart.checkout(100);

    }
}
 /*   The Strategy Design Pattern is a behavioral design pattern that allows you to define a family of algorithms,
    encapsulate each one of them, and make them interchangeable. It lets the client choose the appropriate
        algorithm to use at runtime. This pattern promotes the "Open/Closed Principle"
        by allowing you to add new strategies without modifying existing code.*/