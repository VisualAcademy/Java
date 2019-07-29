// Java 미리보기 
public class PreviewDemo {
    public static void main(String[] args) {        
        //[?] 1부터 100까지 3의 배수이고 그리고 4의 배수의 합
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i; 
            }            
        }

        System.out.println("1부터 100까지 3의 배수이고 그리고 4의 배수의 합: " + sum);
    }
}
