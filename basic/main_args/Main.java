import java.lang.Integer;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        for (String e : args) {
            System.out.printf("%d : %s\n", i, e);
            i++;
        }

        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        System.out.printf("agrs[1] + args[2] = %d\n", a + b);
    }
}
