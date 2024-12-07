package Multithreading.Locks.Example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAcccount
{
    private int balance=100;
    /*
    Here, synchronized keyword is used so only when thread-1 will complete this after that on other thread can access this method
    so, if there is more time then it will be difficult to proceed. Hence, we will use explicit locks.
        */

/*    Synchronized- Implicit
    public synchronized void  withdraw(int amount)
    {
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);
        if (balance>=amount)
        {
            System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal.");
        }
        try {
            Thread.sleep(8000);
        }
        catch (Exception e)
        {
        }
        balance-=amount;
        System.out.println(Thread.currentThread().getName()+" remaining balance is: "+balance);
    }

 */

    //Now we will explicitly make locks
    private final Lock lock=new ReentrantLock();
    public void withdraw(int amount)
    {
        System.out.println(Thread.currentThread().getName()+" is trying to withdraw.");
        try{
           if (lock.tryLock(1000,TimeUnit.MILLISECONDS))
           {
               if (balance>=amount)
               {
                   try {
                       System.out.println(Thread.currentThread().getName()+" is proceeding with the withdrawal");
                       Thread.sleep(3000);
                       balance-=amount;
                       System.out.println(Thread.currentThread().getName()+" remaining balance is: "+balance);
                   }
                   catch (Exception e)
                   {
                       Thread.currentThread().interrupt();
                   }
                   finally {
                       lock.unlock();
                   }
               }
               else {
                   System.out.println(Thread.currentThread().getName()+" insufficient balance!!!");
               }
           }
           else {
               System.out.println(Thread.currentThread().getName()+" has to wait");
           }
        } catch (Exception e)
        {
            Thread.currentThread().interrupt();
        }
    }
}
