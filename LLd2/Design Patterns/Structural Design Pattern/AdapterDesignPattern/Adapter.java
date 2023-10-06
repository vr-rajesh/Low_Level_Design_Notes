package AdapterDesignPattern;
// using Adapter class to bridge Target class and the Adaptee CLass
public class Adapter implements Target{
    private Adaptee adaptee;

    //constructor
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.request();
    }
}
