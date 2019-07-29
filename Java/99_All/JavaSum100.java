public class JavaSum100
{
    public static void main(String args[])
    {
        // 1부터 100까지 정수의 합계
        // Input
        int sum = 0;
        // Process
        for (int i = 1; i <= 100; i++)
        {
            sum += i; // sum = sum + i; // 누적
        }
        // Output
        System.out.println("1부터 100까지 정수의 합계: " + sum);
    }
}
