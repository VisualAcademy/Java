import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        int i;
        int[] data = {1, 3, 5, 7, 9, 11};
        int search = 0;
        int n = data.length;
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 정수(1~20) : ");
        search = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (search == data[i]) {
                flag = true;
            }
        }

        if (flag) {
            System.out.printf("%d를 찾았습니다.\n", search);
        } else {
            System.out.printf("%d를 못 찾았습니다.\n", search);
        }
        sc.close();
    }
}
