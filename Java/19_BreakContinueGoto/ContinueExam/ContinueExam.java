// 1부터 100까지 7의 배수를 제외한 수들의 합계를 구하는 프로그램
public class ContinueExam {
    public static void main(String[] args) {
        int sum = 0; 
        for (int i = 1; i <= 100; i++) {
            // 7의 배수를 제외한
            if (i % 7 == 0) {
                continue; 
            }
            sum += i; // 합계
        }
        System.out.println(sum); // 4315
    }
}
