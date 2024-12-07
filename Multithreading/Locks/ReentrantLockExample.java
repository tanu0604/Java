package Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample
{
    private final Lock lock=new ReentrantLock();

    public static void main(String[] args) {
        ReentrantLockExample example=new ReentrantLockExample();
        example.outerLock();
    }
    public void outerLock()
    {
        lock.lock();
        try {
            System.out.println("Outer Lock");
            innerLock();
        }
        finally {
            lock.unlock();
        }
    }

    public void innerLock()
    {
        lock.lock();
        try {
            System.out.println("Inner Lock");
        }
        finally {
            lock.unlock();
        }
    }
}
