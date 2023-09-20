package SingletonDesignPattern;

public class SingletonMain {
    public static void main(String[] args) {
        // Example 1
        // the get instance method is static so that we can directly call with the call name
        System.out.println(SingletonObject.getInstance());
        System.out.println(SingletonObject.getInstance());
        System.out.println(SingletonObject.getInstance());

        /*
        Output
        SingletonDesignPattern.SingletonObject@1b28cdfa
        SingletonDesignPattern.SingletonObject@1b28cdfa
        SingletonDesignPattern.SingletonObject@1b28cdfa
        */
    }
}


 /*   The Singleton Design Pattern is a creational design pattern that restricts the instantiation of a class to
        ensure that it has only one instance, providing a global point of access to that instance.
        This can be useful in situations where you want to limit the number of instances of a class and
        control access to that single instance across your application.*/
