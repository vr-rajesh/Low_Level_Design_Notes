package Concurrency.CallableThreadClass;

import java.util.concurrent.*;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 10;
            }
        };

        // submit the task for the callable execution
        Future<Integer> future = executorService.submit(callable);
        // get is used to the result from the future object
        Integer result = future.get();

        // releasing the resources by closing it
        executorService.shutdown();
        System.out.println("Result: " + result);
    }
}

/*The callable interface is sued when you want your thread to either return or throw
an exception. The callable has a call method like we have run method for executor service.class */

