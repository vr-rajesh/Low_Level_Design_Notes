package SingletonDesignPattern;

public class SingletonObject {

    private static SingletonObject instance;
    /* here we are declaring the var as static because we are accessing static var in static method*/

    private SingletonObject(){
        /*Private constructor
        We are not allowing anyone to create object with constructor, we
        control how the Singleton instance is created*/
    }

    /*Here we are giving method as static because we cant create object for this class and we can
    call static methods directly with the class name*/
    public static SingletonObject getInstance() {
        if(instance == null){
            instance = new SingletonObject();
        }
        return instance;
    }
     /*The above method is not thread safe because if multiple objects try to enter the method at the same time
     then it will create multiple objects.*/
}
