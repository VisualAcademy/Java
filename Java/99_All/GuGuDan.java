
public class GuGuDan {

	public static void main(String[] args) {

		// �� ���� ǥ��
		for	(int i = 2; i <= 9; i++)
		{
			System.out.printf("%6s  ", Integer.toString(i) + "��");			
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) 		// ��(����) �ݺ�
		{
			for (int j = 2; j <= 9; j++)	// ��(����) �ݺ�
			{
				//System.out.print(j + "*" + i + "=" + (j * i) + "  ");
				System.out.printf("%d*%d=%2d  ", j, i, (j * i));
			}
			System.out.println();			// 1�� ��� �� �ٹٲ�
		}
		
	}
}
