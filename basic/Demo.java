import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            a.add(i * 6 % 10);
        }

        a.forEach((x) -> System.out.print(x));
        System.out.println();
        a.sort((x, y) -> y - x);
        a.forEach((x) -> System.out.print(x));
        System.out.println();
        a.sort((x, y) -> x - y);
        a.forEach((x) -> System.out.print(x));
        System.out.println();
        // var x = 11;
    }
}