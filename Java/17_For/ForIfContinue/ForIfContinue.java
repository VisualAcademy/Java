//[?] continue 문을 사용하여 반복문에서 다음 반복으로 이동하기
public class ForIfContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue; // 짝수 건너뛰기
            }
            System.out.println(i); // 1, 3, 5
        }
    }
}
