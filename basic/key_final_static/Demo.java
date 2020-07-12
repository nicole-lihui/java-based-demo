public class Demo {
    private String name = "Nicole";
    private static int count = 0;

    private final Double PI = 3.14;
    final static int N = 3;

    Demo() {
        count++;
    }

    public static void show() {
        System.out.println("Static Count : " + count + "  ----  Final static N: " + N);
    }

    public void display() {
        System.out.println("Name : " + this.name + "Final PI: " + PI);
    }

    public static void main(String args[]) {
        show();
        System.out.println("Static count : " + count + "  ----  Final static N: " + N);

        Demo d = new Demo();
        d.display();
        System.out.println("Name : " + d.name);
        System.out.println("Static count : " + count + "  ----  Final PI: " + d.PI);
    }
}
