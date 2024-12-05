package Multithreading.ThreadLifecycle;

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("RUNNING STATE");
        try {
            Thread.sleep(2000);
            System.out.println("SLEEPING");
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread(); //object created hence NEW State
        System.out.println(t1.getState());

        t1.start(); // start method written hence the thread is in runnable state
        System.out.println(t1.getState());

//        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000); //main thread will sleep and by then run() will execute
        System.out.println(t1.getState());

        Thread.sleep(3000);
        System.out.println(t1.getState());

        t1.join(); //main method will wait for t1 to get finished.
        System.out.println(t1.getState());
    }
}
