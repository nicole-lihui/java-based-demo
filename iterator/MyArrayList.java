import java.util.NoSuchElementException;
import java.util.Iterator;

/**
 * MyArrayList
 */
public class MyArrayList<T> implements Iterable<T>, Iterator<T>{

    Object[] elementData;
    int size;
    int capacity;
    int incrCapacity = 2;
    int index = 0;

    public MyArrayList(int length) {
        elementData = new Object[size];
        capacity = length;
    }

    public MyArrayList(T[] data) {
        elementData = data;
        size = elementData.length;
        capacity = elementData.length;
    }

    public void add(T e) {
        if(size < capacity) {
            elementData[size] = e;
        } else {
            Object[] newArray = new Object[capacity + incrCapacity];
            int i = 0;
            for (; i < size; i++) {
                newArray[i] = elementData[i];
            }
            newArray[size] = e;
        }
    }

    @Override
    public boolean hasNext() {
        return index < elementData.length;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return (T) elementData[index++];
        }
        throw new NoSuchElementException("only " + elementData.length + " elements");
    }

    @Override
    public Iterator<T> iterator() {
        index = 0;
        return this;
    }
    
    public static void main(String[] args) {
        String[] a = {"11", "22", "hello"};
        MyArrayList<String> myList = new MyArrayList<>(a);

        myList.forEach((v) -> {System.out.println(v);});

        for (String string : myList) {
            System.out.println(string);
        }

        MyArrayList<Integer> list = new MyArrayList<>(3);
        list.add(4);
        list.add(5);

        list.forEach((v) -> {System.out.println(v);});

    }
}
