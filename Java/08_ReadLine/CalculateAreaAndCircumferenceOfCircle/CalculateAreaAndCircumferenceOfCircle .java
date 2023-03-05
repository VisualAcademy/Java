import java.util.Scanner;

class CalculateAreaAndCircumferenceOfCircle {

    public static void main(String[] args) {
        // 상수 선언: PI = 3.141592654...
        final float PI = 3.141592654f;

        // 변수 선언
        float r;

        // 사용자로부터 반지름 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("반지름: ");
        r = scanner.nextFloat();

        // 처리 및 출력
        System.out.println("원의 넓이: " + (r * r * PI));
        System.out.println("원의 둘레 길이: " + (2 * r * PI));
        scanner.close();
    }
}

// 반지름: 5
// 원의 넓이: 78.53982
// 원의 둘레 길이: 31.415928
