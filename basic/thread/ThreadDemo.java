public class ThreadDemo extends Thread {
    A a;

    ThreadDemo(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        this.a.sFoo();
        this.a.rFoo();
    }
}
