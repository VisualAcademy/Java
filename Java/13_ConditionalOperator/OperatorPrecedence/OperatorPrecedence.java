// 자바의 연산자 우선 순위: 괄호(그룹) > 곱셈/나눗셈 > 덧셈/뺄셈
public class OperatorPrecedence
{
    public static void main(String[] args)
    {
        System.out.println(3 + 4 * 2); // 곱하기가 우선: 3 + 8 => 11
        System.out.println((3 + 4) * 2); // 괄호(그룹)가 우선: 7 * 2 => 14
        System.out.println(10 / 5 * 2 + 1); // 왼쪽에서 오른쪽으로: 2 * 2 + 1 => 5
        System.out.println(15 / (5 * (2 + 1))); // 왼쪽에서 오른쪽으로: 15 / (5 * 3) => 1
    }    
}
