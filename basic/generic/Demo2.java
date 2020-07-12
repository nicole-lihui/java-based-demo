public class Demo2 {

    public static void main(String[] args) {
        Integer[] intArr = { 11, 22, 33, 44 };
        String[] strArr = { "aa", "bb", "cc", "dd" };

        A<Integer> intA = new A<Integer>(intArr);
        A<String> strA = new A<String>(strArr);

        intA.show();
        strA.show();
    }
}
