//2. Implementing the Runnable Interface

package Multithreading.Example2;

public class Hello
{
    public static void main(String[] args) {

        World world=new World();
        Thread t1=new Thread(world);
        t1.start();
        for (; ;) {  //infinite for loop
//            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello");
        }
    }
}
