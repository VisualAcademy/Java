// Func Delegate 
import java.util.function.Function;
import java.util.function.BiFunction; 

public class FuncDemo {
    public static void main(String[] args) {
        Function<Integer, Boolean> zero = number -> number == 0;
        System.out.println("Result: " + zero.apply(1234 - 1234)); // true
        System.out.println("Result: " + zero.apply(1234)); // false

        Function<Integer, Integer> one = n -> n + 1;
        System.out.println("Result: " + one.apply(1)); // 2

        BiFunction<Integer, Integer, Integer> two = (x, y) -> x + y;
        System.out.println("Result: " + two.apply(3, 5)); // 8
    }
}
