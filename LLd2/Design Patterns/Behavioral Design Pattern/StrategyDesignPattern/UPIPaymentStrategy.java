package StrategyDesignPattern;

public class UPIPaymentStrategy implements  PaymentStrategy{

    private int UPIID;
    private  int pin;

    public UPIPaymentStrategy(int UPIID, int pin) {
        this.UPIID = UPIID;
        this.pin = pin;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid via UPI");
    }
}
