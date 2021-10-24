package homework9.task2;

public class ClassB extends Thread {
    Thread threadA;

    @Override
    public void run() {
        try {
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B finished");
    }
}
