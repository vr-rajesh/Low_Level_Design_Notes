package StrategyDesignPattern;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    private int cardNumber;
    private int pin;

    public CreditCardPaymentStrategy(int cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid via Credit Card");
    }
}
