//1. Extending the Thread Class


package Multithreading.Example1;

public class Hello
{
    public static void main(String[] args) {
        World world=new World(); //NEW STATE
        world.start(); //RUNNABLE STATE

        for (int i = 0; i < 1000; i++) {
//            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
