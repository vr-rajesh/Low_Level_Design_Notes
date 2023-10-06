package AdapterDesignPattern;

public class AdapterMain {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }

}


/*
    The Adapter design pattern is a structural design pattern used in software engineering.
        It allows you to interface between two incompatible interfaces or classes.
        It essentially acts as a bridge between two different interfaces so that they can work together.
        This pattern is particularly useful when you have existing code or components that cannot be easily
        modified but need to work together.*/
