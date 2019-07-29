//[?] 정수를 양의 정수, 0, 음의 정수로 판단하기(else if)
public class PositiveNegativeZero
{
    public static void main(String[] args)
    {
        int number = -10;

        if (number > 0)
        {
            System.out.printf("%d는 양수입니다.\n", number);
        }
        else if (number < 0)
        {
            System.out.printf("%d는 음수입니다.\n", number);
        }
        else
        {
            System.out.printf("%d는 0입니다.\n", number);
        }
    }
}
