//[!] foreach문으로 배열의 값을 반복해서 사용
public class ArrayForEach
{
    public static void main(String[] args)
    {
        float[] arr = { 10.5f, 20.1f, 30.2f };

        float sum = 0.0f;

        for (float f: arr)
        {
            sum += f;
        }

        System.out.println(sum); // 60.800003
        System.out.println(String.format("%.2f", sum));
    }
}
