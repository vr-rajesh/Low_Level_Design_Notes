package Concurrency.SimpleThreadClass;

public class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            System.out.println("Custom Thread :"+ i);
        }
    }
}
