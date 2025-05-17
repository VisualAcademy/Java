public class ArrayTotalAverage {
    public static void main(String[] args) {
        int[] kor = new int[3];   // 국어 점수를 저장할 배열
        int sum = 0;              // 합계를 저장할 변수
        float avg = 0;            // 평균을 저장할 변수

        // 배열에 점수 직접 대입
        kor[0] = 100;
        kor[1] = 90;
        kor[2] = 80;

        // 총점 계산
        sum = kor[0] + kor[1] + kor[2];

        // 평균 계산 (형 변환을 통해 실수로 나눔)
        avg = sum / 3.0f;

        // 총점과 평균 출력 (평균은 소수점 둘째 자리까지)
        System.out.printf("총점: %d, 평균: %.2f\n", sum, avg);
    }
}