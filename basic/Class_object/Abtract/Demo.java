public class Demo {

    public static void main(String[] args) {
        A d = new A() {
            String x = "D";

            public void foo() {
                System.out.println("D.foo(): " + x);
            }
        };
        d.foo();
    }
}
