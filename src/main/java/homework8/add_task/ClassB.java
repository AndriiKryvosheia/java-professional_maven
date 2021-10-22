package homework8.add_task;

public class ClassB implements Runnable {
    String b1;
    String b2;

    public ClassB() {
        this.b1 = "b1";
        this.b2 = "b2";
    }

    public String getB1() {
        return b1;
    }

    public String getB2() {
        return b2;
    }

    @Override
    public void run() {
        Main.getInstance().printMethod(Thread.currentThread(), "getB1", getB1());
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Main.getInstance().printMethod(Thread.currentThread(), "getB2", getB2());
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
