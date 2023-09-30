package StrategyDesignPattern;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;

    public void getPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
