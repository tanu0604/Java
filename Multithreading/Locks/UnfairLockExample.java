package Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLockExample
{
    private final Lock unfairLock=new ReentrantLock();
    public void accessResource()
    {
        unfairLock.lock();
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" has been locked.");
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        finally {
            System.out.println(Thread.currentThread().getName()+" has released the resources.");
            unfairLock.unlock();

        }
    }
    public static void main(String[] args) {
        UnfairLockExample example=new UnfairLockExample();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };
        Thread t1=new Thread(task,"Thread-1");
        Thread t2=new Thread(task,"Thread-2");
        Thread t3=new Thread(task,"Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
