package Concurrency.SimpleThreadClass;

public class MainThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for(int i=1;i<=20;i++){
            System.out.println("Main Thread :"+ i);
        }
    }
}
