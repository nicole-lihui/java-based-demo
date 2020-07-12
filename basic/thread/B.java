public class B {
    void rFoo() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(200l);
            } catch (InterruptedException e) {
              // TODO Auto-generated catch block
                e.printStackTrace();
            }
              System.out.println(Thread.currentThread().getName() + " B: " + i);
        }
    }

    void sFoo() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(200l);
            } catch (InterruptedException e) {
              // TODO Auto-generated catch block
                e.printStackTrace();
            }
              System.out.println(Thread.currentThread().getName() + " B: " + i * 11);
        }
    }
}
