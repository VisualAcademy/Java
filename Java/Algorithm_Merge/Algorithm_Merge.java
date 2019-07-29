public class Algorithm_Merge
{
    public static void main(String[] args)
    {
        int[] first = {1, 3, 5 }; 
        int[] second = { 2, 4 };
        int[] merge = new int[first.length + second.length]; // MEARGE될 배열
        int i = 0; int j = 0; int k = 0;
        int M = first.length; int N = second.length; 

        //[2] Process
        while (i < M && j < N)              // 모두 끝에 도달할 때까지
        {   
            if (first[i] <= second[j]) {
                merge[k++] = first[i++]; 
            }
            else {
                merge[k++] = second[j++]; 
            }
        }            

        while (i < M)                       // 첫번째 배열이 끝까지 도달할 때까지
        {   
            merge[k++] = first[i++]; 
        }
        while (j < N)                       // 두번째 배열이 끝까지 도달할 때까지
        {
            merge[k++] = second[j++];             
        }        

        for (int i = 0; i < merge.length; i++)
        {
            System.out.println(merge[i]);
        }
    }
}
