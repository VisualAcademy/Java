public class Algorithm_FillArray_Basic
{
    public static void main(String[] args)
    {
        int[][] arr = new int[5][5]; 
        int value = 0; 
        // 배열 기본 채우기
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                arr[i][j] = ++value;
            }
        }

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
