public class Algorithm_PrimeNumber {
    public static void main(String[] args) {
        int num = 7;
        int i = 1; // 소수에서 1은 제외  

        do {
            i = i + 1; // 처음 비교는 2부터 
            System.out.printf("%d %% %d = %d\n", num, i, (num % i)); // 중간 단계 표시
        } while (num % i != 0); // 소수는 자기 자신, 나머지는 약수로 나누어 떨어질 때까지  

        if (num == i) {
            System.out.println("소수임");
        }
        else {
            System.out.println("소수가 아님");
        }
    }    
}
