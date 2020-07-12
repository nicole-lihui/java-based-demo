interface FunObj {
    void foo();
}

public class FunctionObject {
    static void test(FunObj funObj) {
        funObj.foo();
    }
    public static void main(String[] args) {
        FunObj fa = () -> {
            System.out.println("Hello, Function Object");
        };
        test(fa);

        test(() -> {
            System.out.println("Test2");
        });
    }
}
