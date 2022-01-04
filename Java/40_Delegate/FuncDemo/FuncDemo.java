// Func Delegate(대리자) 사용하기 - Function, BiFunction 인터페이스를 사용하여 초간단 람다식 표현  
import java.util.function.Function;
import java.util.function.BiFunction; 

public class FuncDemo {
    public static void main(String[] args) {
        //[1] Function<매개변수, 반환값> isZero = ... 
        // zero.apply() 메서드는 0인지 아닌지를 판단 
        Function<Integer, Boolean> zero = number -> number == 0;
        System.out.println("Result: " + zero.apply(1234 - 1234)); // true
        System.out.println("Result: " + zero.apply(1234)); // false

        //[2] one.apply() 메서드는 정수에 1을 더해서 반환해주는 기능 
        Function<Integer, Integer> one = n -> n + 1;
        System.out.println("Result: " + one.apply(1)); // 2

        //[3] two.apply() 메서드는 두 수의 합을 반환
        BiFunction<Integer, Integer, Integer> two = (x, y) -> x + y;
        System.out.println("Result: " + two.apply(3, 5)); // 8
    }
}
