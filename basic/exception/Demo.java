public class Demo {

    public static <T> void display(T[] arr) {
        int i = 0;
        while (i <= arr.length) {
            try {
                System.out.println(arr[i++]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("异常：数据越界");
            } finally {
                System.out.println("--------------finally------------");
            }
        }

    }

    public static void main(String args[]) {
        String[] arr = { "aa", "bb", "cc" };
        display(arr);
        System.out.println("程序正常结束");
    }
}

