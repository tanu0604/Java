package Multithreading.ThreadClassMethod.Example1;

public class PriorityMethod extends Thread
{
    //Changing the name of the Thread to Tanushree
    public PriorityMethod(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" Priority- "+Thread.currentThread().getPriority()+" count- "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        //Creating 3 threads
        PriorityMethod t1=new PriorityMethod("Low Priority Thread");
        PriorityMethod t2=new PriorityMethod("Normal Priority Thread");
        PriorityMethod t3=new PriorityMethod("High Priority Thread");

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
