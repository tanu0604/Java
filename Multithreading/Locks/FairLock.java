package Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLock
{
    private final Lock fairLock=new ReentrantLock(true);

    public void accessResources()
    {
        fairLock.lock();
        try {
         Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" has been locked");
        }
        catch (Exception e)
        {
            Thread.currentThread().interrupt();
        }
        finally {
            System.out.println(Thread.currentThread().getName()+" has released the resources");
            fairLock.unlock();
        }
    }

    public static void main(String[] args) {
        FairLock example=new FairLock();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                example.accessResources();
            }
        };
        Thread thread1=new Thread(task,"Thread-1");
        Thread thread2=new Thread(task,"Thread-2");
        Thread thread3=new Thread(task,"Thread-3");

        try {
            thread1.start();
            Thread.sleep(50);
            thread2.start();
            Thread.sleep(50);
            thread3.start();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
