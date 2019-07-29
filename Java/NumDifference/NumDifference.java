// 두 수의 차이 구하기 
public class NumDifference
{
    public static void main(String[] args)    
    {
        int first = 3;
        int second = 5; 
        int diff = 0;
      
        if (first > second)
        {
            diff = first - second; // first 변수가 더 큼
        }
        else
        {
            diff = second - first; // second 변수가 더 큼
        }

        System.out.printf("%d와 %d의 차이: %d\n", first, second, diff);
    }
}
