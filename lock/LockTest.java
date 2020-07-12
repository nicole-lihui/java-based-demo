public class LockTest {

    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable r = () -> {
           for(int i = 0; i < 10; i++) {
               c.changeNum(i);
           }
        };
        
        for (int i = 0; i < 3; i++) {
            new Thread(r).start();
        }
    }
}
