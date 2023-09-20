package SingletonDesignPattern;

public class SingletonObjectThreadSafeOptimized {
    private static volatile SingletonObjectThreadSafeOptimized instance;

    private SingletonObjectThreadSafeOptimized() {
         /*The constructor of the class is made private, which prevents other
        classes from creating new instances of Singleton.*/
    }

    // this method has a better thread safe mech than the previous one this is thread safe and performance issue is also optimized
    public static SingletonObjectThreadSafeOptimized getInstance() {
        if(instance == null){
            synchronized(SingletonObjectThreadSafeOptimized.class){ // sync block
                if (instance == null)
                    instance = new SingletonObjectThreadSafeOptimized();
            }
        }
        return instance;
    }
}

    /*This version of the singleton pattern ensures that only one instance is created even in a multi-threaded environment.
        The volatile keyword ensures that changes to the instance variable are immediately visible to all threads.
        The double-checked locking within the getInstance method further minimizes the overhead of synchronization.*/
