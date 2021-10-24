package homework9.add_task;

public class ClassA extends Thread {

    @Override
    public void run() {
        System.out.println("Демон: выполняется поток");
        System.out.println("Демон, getName(): " + Thread.currentThread().getName());
        System.out.println("Демон, isDaemon(): " + Thread.currentThread().isDaemon());
    }
}
