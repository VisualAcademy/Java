import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 요소를 입력하세요.");
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0], max = arr[0];
        for (int i = 1; i < 3; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);
    }
}