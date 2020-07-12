/**
 * InvelTime
 */
public class InvelTime {
    int count = 0;
    interface La {
        void foo();
    }

    public static void main(String[] args) {
        long startt = System.currentTimeMillis();
        do {
            final long count = System.currentTimeMillis() - startt;
            La la = () -> {
                System.out.println(count);
            };
            la.foo();
        } while ((System.currentTimeMillis() - startt) <= 2000);
    }
}
