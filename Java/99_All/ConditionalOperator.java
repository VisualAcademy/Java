public class ConditionalOperator {
    public static void main(String[] args) {
        int number = 3;

        String result = (number % 2 == 0) ? "짝수" : "홀수";

        System.out.println(String.format("%d은(는) %s입니다.", number, result));
    }
}
