public class ReturnValueFunction {
    // [1] 반환값도 없고 매개변수도 없는 함수
    public static void hi() {
        System.out.println("안녕");
    }

    // [2] 반환값은 없고 매개변수가 있는 함수
    public static void hello(String message) {
        System.out.println(message);
    }

    // [3] 반환값과 매개변수가 있는 함수
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int result;

        // [1] 매개변수도 없고 반환값도 없는 경우
        hi();
        hi();

        // [2] 매개변수는 있고 반환값이 없는 경우
        hello("안녕하세요.");
        hello("반갑습니다.");

        // [3] 매개변수도 있고 반환값도 있는 경우
        result = sum(5, 5);
        System.out.println(result);
    }
}
