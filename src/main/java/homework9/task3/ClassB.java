package homework9.task3;

public class ClassB extends Thread {
    Thread threadA;

    @Override
    public void run() {
        try {
            threadA.join(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B finished");
    }
}
