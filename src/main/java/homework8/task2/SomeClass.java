package homework8.task2;

public class SomeClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Запущен поток " + Thread.currentThread().getName());
    }
}
