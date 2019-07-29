import java.util.Scanner;

public class ScannerDescription {
    public static void main(String[] args) {
        // 스캐너 개체 생성
        System.out.printf("입력: ");
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력
        String inputString = scanner.nextLine(); // nextInt(): 정수

        // 입력값 출력
        System.out.printf("출력: %s\n", inputString); 
    }
}
