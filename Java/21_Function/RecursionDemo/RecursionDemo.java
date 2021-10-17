// 재귀 함수(Recursion)
public class RecursionDemo {
	public static void main(String[] args) {
		// 재귀 호출을 사용하여 Factorial 구하기 : 3! = 3 * 2 * 1 = 6
		System.out.println(3 * 2 * 1);
		System.out.println(FactorialFor(4)); // 24
		System.out.println(Factorial(4)); // 기준
		System.out.println(Fact(10));
	}

	// 3항 연산자를 사용한 Factorial 구하기
	private static int Fact(int n) {
		return (n > 1) ? n * Fact(n - 1) : 1;
	}

	// 재귀 함수를 사용한 Factorial 함수 만들기: 단, 재귀함수는 Tree 구조 탐색에 유리
	private static int Factorial(int n) {
		// 종료
		if (n == 0 || n == 1) {
			return 1; // 0! => 1로 설정
		}
		// 재귀호출
		return n * Factorial(n - 1); // n! = 4 * (4-1)
	}

	// 팩토리얼을 일반적인 코드로 사용
	private static int FactorialFor(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i; // 1 * 2 * 3 * .. * n
		}
		return result;
	}
}
