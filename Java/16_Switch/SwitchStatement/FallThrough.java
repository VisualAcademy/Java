import java.util.Scanner;

public class FallThrough {
    public static void main(String[] args) {
        System.out.println("가장 좋아하는 프로그래밍 언어는?");
        System.out.println("1. C");
        System.out.println("2. C++");
        System.out.println("3. C#");
        System.out.println("4. Java");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close(); 

        // break 나올 때까지 실행 
        switch (choice) {
            case 1:
                System.out.println("C 언어 선택");
            case 2:
                System.out.println("C++ 선택");
            case 3:
                System.out.println("C# 선택");
                break;        
            case 4:
                System.out.println("Java 선택");
                break;        
            default:
                System.out.println("C, C++, C#, Java가 아니군요.");
                break;
        }

        // 내용없이 하나 이상의 값과 매치될 때 실행 
        switch (choice) {
            case 1:
            case 2:
            case 3:
                System.out.println("C 계열 선택");
                break;        
            case 4:
                System.out.println("Java 선택");
                break;        
            default:
                System.out.println("C, C++, C#, Java가 아니군요.");
                break;
        }
    }
}
