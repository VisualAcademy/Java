import java.util.Scanner;

public class CircleArea {
    // 원주율 상수 정의
    static final double PI = 3.14159265;

    // calculateCircleArea 메소드: 반지름 값을 인수로 받아 원의 넓이를 계산하여 반환하는 메소드
    static double calculateCircleArea(double radius) {
        return PI * radius * radius; // 원의 넓이 공식: PI * 반지름 * 반지름
    }

    public static void main(String[] args) {
        double radius; // 원의 반지름을 저장할 변수 선언
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 원의 반지름을 입력 받기
        System.out.print("원의 반지름을 입력하세요: ");
        radius = scanner.nextDouble();

        // 원의 넓이를 계산한 후, 소수점 둘째 자리까지 출력
        System.out.printf("원의 넓이: %.2f%n", calculateCircleArea(radius));
    }
}