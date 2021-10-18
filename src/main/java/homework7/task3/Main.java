package homework7.task3;

public class Main {
    public static void main(String[] args) {

        Eagle eagle = new Eagle(15, 8, "someEagle", 2);

        Eagle otherEagle = new Eagle(eagle);
        otherEagle.name = "otherEagle";

        System.out.println(otherEagle);
    }
}
