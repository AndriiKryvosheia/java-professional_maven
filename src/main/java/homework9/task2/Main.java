package homework9.task2;

public class Main {
    public static void main(String[] args) {

        ClassA instA = new ClassA();
        ClassB instB = new ClassB();

        instA.threadB = instA;
        instB.threadA = instB;

        instA.start();
        instB.start();
    }
}
