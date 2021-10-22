package homework8.task3;

public class SomeClass implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            System.out.println(Thread.currentThread().getName() + ": i = " + i);
        }
    }
}
