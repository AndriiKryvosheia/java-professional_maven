package homework7.task4;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/resources/homework7/animals");
        AnimalParser.parse(file);
    }
}
