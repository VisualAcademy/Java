public class Algorithm_PrimeNumber_Count {
    public static void main(String[] args) {
        int cnt = 0; // 소수 개수
        int num = 15; // 2부터 15까지 범위: 2, 3, 5, 7, 11, 13
        boolean sw = true; // 소수(true)
        for (int i = 2; i <= num; i++) {
            sw = true; // 일단 모든 반복마다 소수로 놓고 시작
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sw = false; 
                    break; // 반복 종료
                }
            }
            if (sw == true) {
                cnt = cnt + 1; // 소수이면 개수 증가    
            }
        }
        System.out.println("소수 개수: " + cnt); 
    }
}
