import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        // 문자열 변수를 선언합니다.
        String str;
        
        // Scanner 객체를 생성하여 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 문자열을 입력받기 위한 안내 메시지를 출력합니다.
        System.out.print("문자열을 입력하세요: ");

        // 입력된 문자열을 str 변수에 저장합니다.
        str = scanner.nextLine();
        
        // 문자열의 길이를 계산하고 출력합니다.
        System.out.println("문자열의 길이: " + str.length());
        
        // Scanner를 닫습니다.
        scanner.close();
    }
}