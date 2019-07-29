import java.util.Scanner;

public class ScannerSystemIn {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);

        String name = my.nextLine(); // 문자열
        int age = my.nextInt(); // 정수

        String r = String.format("이름: %s, 나이: %d", name, age);
        System.out.println(r); 
    }
}
