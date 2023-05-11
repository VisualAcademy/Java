// 1부터 3까지의 합계 구하기
public class ForSum {
    public static void main(String[] args) {
        int n = 3; // 반복 범위 지정: 1부터 n까지
        int sum = 0; // 합계를 저장할 변수

        for (int i = 1; i <= n; i++) {
            sum += i; // i의 값을 sum에 누적
        }

        System.out.printf("1부터 %d까지의 합: %d\n", n, sum); // 결과 출력: 1부터 3까지의 합: 6
    }
}
