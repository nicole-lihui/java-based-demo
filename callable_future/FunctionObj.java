/**
 * FunctionObj
 */
public class FunctionObj {

    static void exFoo(Runnable toRun) {
        toRun.run();
    }

    static void foo() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        exFoo(FunctionObj::foo);
    }
}
