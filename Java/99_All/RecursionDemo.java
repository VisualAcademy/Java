public class RecursionDemo {

	public static void main(String[] args) {
		// ��� ȣ���� ����Ͽ� Factorial ���ϱ� : 3! = 3 * 2 * 1 = 6
		System.out.println(3 * 2 * 1);		
		System.out.println(FactorialFor(4)); // 24
		System.out.println(Factorial(4)); // ����
		System.out.println(Fact(10));
	}
	
	// 3�� �����ڸ� ����� factorial ���ϱ�
	private static int Fact(int n)
	{
		return (n > 1) ? n * Fact(n - 1) : 1;
	}	
	
	// ��� �Լ��� ����� ��� ���ϱ� �Լ�
	private static int Factorial(int n)
	{
		// ����
		if (n == 0 || n == 1)
		{
			return 1; // 0! => 1�� ����			
		}
		// ���ȣ��
		return n * Factorial(n - 1); // n! = 4 * (4-1)  
	}
	
	// ���丮���� �Ϲ����� �ڵ�� ���
	private static int FactorialFor(int n)
	{
		int result = 1;
		for (int i = 1; i <= n; i++)
		{
			result *= i; // 1 * 2 * 3 * .. * n
		}
		return result;
	}

}
