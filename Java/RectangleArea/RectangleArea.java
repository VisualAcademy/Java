import java.util.Scanner;

public class RectangleArea {

    // 직사각형의 넓이를 계산하는 함수
    public static int rectangleArea(int width, int height) {
        return width * height; // 가로 * 세로
    }

    public static void main(String[] args) {
        int width, height;

        // 사용자로부터 직사각형의 가로와 세로 길이를 입력받음
        Scanner scanner = new Scanner(System.in);
        System.out.print("직사각형의 가로와 세로 길이를 입력하세요: ");
        width = scanner.nextInt();
        height = scanner.nextInt();
        scanner.close();

        // 계산된 넓이를 출력
        System.out.printf("직사각형의 넓이: %d\n", rectangleArea(width, height));
    }
}