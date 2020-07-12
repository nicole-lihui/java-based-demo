import java.util.function.Function;

/**
 * FunctionDemo
 */
public class FunctionDemo<In, Out> {
    Function<In, Out> foo = In -> {
        return (Out) new String("Hello " + In);
    };

    public static void main(String[] args) {
        FunctionDemo<String, String> f = new FunctionDemo<>();
        String name = "Niocle";

        System.out.println(f.foo.apply(name));
    }
}
