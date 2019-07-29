
public class GuGuDan {

	public static void main(String[] args) {

		// 단 제목 표시
		for	(int i = 2; i <= 9; i++)
		{
			System.out.printf("%6s  ", Integer.toString(i) + "단");			
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) 		// 행(세로) 반복
		{
			for (int j = 2; j <= 9; j++)	// 열(가로) 반복
			{
				//System.out.print(j + "*" + i + "=" + (j * i) + "  ");
				System.out.printf("%d*%d=%2d  ", j, i, (j * i));
			}
			System.out.println();			// 1줄 출력 후 줄바꿈
		}
		
	}
}
