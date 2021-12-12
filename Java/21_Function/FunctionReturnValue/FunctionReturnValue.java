// 반환값이 있는 함수(메서드)
public class FunctionReturnValue
{
    public static int squareFunction(int x)
    {
        int r = x * x;
        return r; 
    }
    public static void main(String[] args)
    {
        int r = squareFunction(2);
        System.out.println(r); // 4
    }
}
