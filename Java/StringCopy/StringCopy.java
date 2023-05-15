import java.util.Scanner;

public class StringCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원본 문자열을 입력하세요: ");
        String src = scanner.nextLine();

        String dest = src;

        System.out.println("복사된 문자열: " + dest);
    }
}
