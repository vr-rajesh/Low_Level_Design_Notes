package SingletonDesignPattern;

public class SingletonObjectThreadSafe {
    private static SingletonObjectThreadSafe instance;

    private SingletonObjectThreadSafe(){

        /*The constructor of the class is made private, which prevents other
        classes from creating new instances of Singleton.*/
    }

    public synchronized static SingletonObjectThreadSafe getInstance(){ // sync method
        if (instance == null){
            instance = new SingletonObjectThreadSafe();
        }
        return instance;
    }
     /*here we are making the method as sync which will not allow multiple thread to enter the method at the same time
     but locking the entire method will reduce the performance issue when multiple threads are in the waiting state*/
}
