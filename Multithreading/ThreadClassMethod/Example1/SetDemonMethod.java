package Multithreading.ThreadClassMethod.Example1;

public class SetDemonMethod extends Thread {
    public SetDemonMethod(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Hello World");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SetDemonMethod daemonThread = new SetDemonMethod("Daemon-Thread");
        daemonThread.setDaemon(true);

        SetDemonMethod userThread = new SetDemonMethod("User-Thread");
        userThread.start();

        daemonThread.start();

        System.out.println("Main thread finished");
    }
}
