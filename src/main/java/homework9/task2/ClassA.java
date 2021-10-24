package homework9.task2;

public class ClassA extends Thread {
    Thread threadB;

    @Override
    public void run() {
        try {
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("A finished");
    }
}
