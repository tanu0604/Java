package Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter
{
    private int count=0;

    private final ReadWriteLock lock=new ReentrantReadWriteLock();
    private final Lock readLock=lock.readLock();
    private final Lock writeLock=lock.writeLock();

    public void increment()
    {
        writeLock.lock();
        try {
            count++;
        }
        finally {
            writeLock.unlock();
        }
    }

    public int getCount()
    {
        readLock.lock();
        try {
            return count;
        }
        finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ReadWriteCounter counter=new ReadWriteCounter();
        Runnable readTask=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" read: "+counter.getCount());
                }
            }
        };

        Runnable writeTask=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName()+" is incremented");

                }
            }
        };

        //Create 3 threads : 1 will write and other 2 threads will read
        Thread writeThread=new Thread(writeTask);
        Thread readThread1=new Thread(readTask);
        Thread readThread2=new Thread(readTask);

        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final count: "+counter.getCount());
    }
}
