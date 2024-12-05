package Multithreading.Example2;

public class World implements Runnable
{
    @Override
    public void run()
    {
        for (; ;) //infinite for loop
        {
            //        System.out.println(Thread.currentThread().getName());
            System.out.println("World");
        }
    }
}
