// 알고리즘_완전수: 자신을 제외한 약수의 합이 자신과 같은 수
// 6 = 1 + 2 + 3
// 1부터 10000까지의 완전수와 개수를 출력
public class Algorithm_PerfectNumber
{
    public static void main(String[] args)
    {
        int sum = 0; // 약수의 합계
        int cnt = 0; // 완전수의 개수
        int max = 0; // 가장 큰 약수
        int rem = 0; // 나머지값 임시 보관

        for (int i = 1; i <= 10000; i++)
        {
            sum = 0;        // 매 반복마다 0으로 초기화
            max = i / 2;    // 모든 짝수를 2로 나누면 가장 큰 약수       
            for (int j = 1; j <= max; j++)
            {
                rem = i - (i / j) * j; // i % j;
                if (rem == 0) // 약수 확인
                {
                    sum = sum + j; // 약수의 합계 
                }
            }    
            if (i == sum)   
            {
                System.out.println("완전수: " + i);
                cnt = cnt + 1; 
            }
        }        
        System.out.println("완전수 개수 : " + cnt);
    }
}
//완전수 : 6
//완전수 : 28
//완전수 : 496
//완전수 : 8128
//완전수 개수 : 4
//계속하려면 아무 키나 누르십시오. . .
