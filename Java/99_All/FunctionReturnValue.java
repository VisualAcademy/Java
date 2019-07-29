// 반환값이 있는 함수(메서드)
public class FunctionReturnValue
{
    public static int SquareFunction(int x)
    {
        int r = x * x;
        return r; 
    }
    public static void main(String[] args)
    {
        int r = SquareFunction(2);
        System.out.println(r); // 4
    }
}
