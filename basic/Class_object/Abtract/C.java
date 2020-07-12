public class C {
    String x = "C";

    class B extends A {
        String x = "B";

        @Override
        public void foo() {
            System.out.println("B.foo(): " + x);
        }
    }

    void foo() {
        A a = new B();
        a.foo();
        System.out.println("C.foo(): " + x);
    }

}
