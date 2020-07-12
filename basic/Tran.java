public class Tran {
    public static void main(String[] args) {
        for (var i = 0; i <= 15; i++) {
            var b = Integer.toBinaryString(i);
            var x = String.format("%x", i);

            System.out.println("0b" + b + " = 0x" + x);
        }
    }
}