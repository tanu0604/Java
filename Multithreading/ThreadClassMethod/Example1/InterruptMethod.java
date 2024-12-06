package Multithreading.ThreadClassMethod.Example1;

public class InterruptMethod extends Thread
{
    @Override
    public void run()
    {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running...");
        } catch (InterruptedException e)
        {
            System.out.println("Exception "+e);
        }
    }
    public static void main(String[] args)
    {
        InterruptMethod t1=new InterruptMethod();
        t1.start();
        t1.interrupt();
    }
}
