public class RunnableDemo implements Runnable {
    A a;

    RunnableDemo(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        this.a.rFoo();
    }
}

