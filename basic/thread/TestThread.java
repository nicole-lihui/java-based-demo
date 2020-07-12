public class TestThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();


        // Thread tt1 = new ThreadDemo(a);
        // Thread tt2 = new ThreadDemo(a);
        // tt1.start();
        // tt2.start();

        // Thread tt3 = new ThreadDemo(a);
        // tt3.start();

        // Thread tt4 = new ThreadDemo(a);
        // tt4.start();


        // Thread rt1 = new Thread(new RunnableDemo(a));
        // Thread rt2 = new Thread(new RunnableDemo(a));
        // rt1.start();
        // rt2.start();

        Runnable rDeno = () -> {
            synchronized(a) {
                a.sFoo();
                a.rFoo();

            }
        };

        Runnable rDeno1 = () -> {
            synchronized(a) {
                a.sFoo();
                a.rFoo();
                b.sFoo();
                b.rFoo();
                c.sFoo();
                c.rFoo();
            }
        };

        Thread rt3 = new Thread(rDeno1);
        rt3.start();
        Thread rt4 = new Thread(rDeno1);
        rt4.start();
        
    }
}
