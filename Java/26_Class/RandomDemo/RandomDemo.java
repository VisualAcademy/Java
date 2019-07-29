import java.util.Random; 

public class RandomDemo {
    public static void main(String[] args) {
        // 랜덤 숫자 출력하기
        Random rnd = new Random();
        int r = rnd.nextInt(10); // 0~9
        System.out.println("랜덤 숫자: " + r);
    }
}
