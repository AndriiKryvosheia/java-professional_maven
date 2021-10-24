package homework9.task3;

public class ClassA extends Thread {
    Thread threadB;

    @Override
    public void run() {
        try {
            threadB.join(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("A finished");
    }
}
