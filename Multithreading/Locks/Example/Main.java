package Multithreading.Locks.Example;

public class Main
{
    public static void main(String[] args) {
        BankAcccount bankAcccount=new BankAcccount();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                bankAcccount.withdraw(50);
            }
        };
        Thread t1=new Thread(task,"Thread-1");
        Thread t2=new Thread(task,"Thread-2");
        t1.start();
        t2.start();
    }
}
