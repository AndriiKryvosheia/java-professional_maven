package homework10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(20);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);

        int sum = list.stream().map(a -> (int) Math.pow(a, 2))
                .reduce(0, (a , b) -> (a + b));
        System.out.println(sum);
    }
}
