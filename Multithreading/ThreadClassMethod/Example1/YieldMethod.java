package Multithreading.ThreadClassMethod.Example1;

public class YieldMethod extends Thread
{
    public  YieldMethod(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" is running...");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldMethod t1=new YieldMethod("Thread-1");
        YieldMethod t2=new YieldMethod("Thread-2");
        t1.start();
        t2.start();
    }
}
