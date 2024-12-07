package Multithreading.Synchronization;

public class Counter
{
    private int count=0;
    public synchronized void increment() //critical section
            //synchronize keyword is used so that only one thread can access one at a time.
    {
        count++;
    }
    public int getCount()
    {
        return count;
    }
}
