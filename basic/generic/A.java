public class A<E> {
    private E[] arr;

    A(E[] arr) {
        this.arr = arr;
    }

    public void show() {
        for (E e : this.arr) {
            System.out.printf("%s ", e);
        }
        System.out.println();
    }
}
