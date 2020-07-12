import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int num = 20;
    Lock counterlock = new ReentrantLock();
    
    public void changeNum(int i) {
        counterlock.lock();
        try {
            Thread.sleep((long) (100l * Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf(Thread.currentThread().getName() + " : %d => %d\n", i, --num);
            counterlock.unlock();
        }
    }
}
