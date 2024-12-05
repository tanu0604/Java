package Multithreading.Example1;

public class World extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
//            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
