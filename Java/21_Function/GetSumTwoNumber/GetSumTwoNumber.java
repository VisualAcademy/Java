// 두 수의 합을 구하는 함수(메서드)
public class GetSumTwoNumber {
    public static double getSum(double x, double y) {
        double r = x + y;
        return r; 
    }

    public static void main(String[] args) {
        System.out.println(getSum(3, 5));       // 8.0
        System.out.println(getSum(3, 0.14));    // 3.14
    }
}
