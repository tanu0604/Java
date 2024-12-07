package Multithreading.Synchronization;
public class Test
{
    public static void main(String[] args) {
        Counter counter=new Counter();
        // both the threads are accessing the same resource counter.
        MyThread t1=new MyThread(counter);
        MyThread t2=new MyThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println(counter.getCount());
    }


}
