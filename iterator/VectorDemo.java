import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * VectorDemo
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector v = new Vector<>(3, 2);
        System.out.println(v.size());
        System.out.println(v.capacity());

        v.add(13);
        v.add(33);
        v.add(44);
        v.add(55);
        System.out.println(v.capacity());

        Iterator itr = v.iterator();

        while (itr.hasNext()) {
            Object i = itr.next();
            System.out.println(i);
        }
    }
}
