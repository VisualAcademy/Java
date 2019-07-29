// 1부터 10까지 출력할 때 사용자로부터 입력받은 수까지만 출력하는 프로그램
import java.util.Scanner; 

public class BreakPractice {
    public static void main(String[] args) {
        System.out.print("1부터 10까지 하나만 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == number) {
                break; // 반복문 탈출
            }
        }
    }
}
