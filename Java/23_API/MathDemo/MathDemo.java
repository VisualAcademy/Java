// 수학 관련 클래스
public class MathDemo {
	public static void main(String[] args) {

		System.out.println(Math.PI); // 3.14
		System.out.println(Math.abs(-10)); // 절대값 : 10
		System.out.println(Math.max(10, 20)); // 최댓값 20
		System.out.println(Math.min(10, 20)); // 최솟값 10
		System.out.println(Math.round(3.5415)); // 반올림 4

		// 두자리까지 : 원본 * 100 / 100.0
		double result = Math.round(3.156 * 100) / 100.0; // 3.16
		System.out.println(result);

		// 2 ^ 10
		System.out.println(Math.pow(2, 20)); // 1024, 1048576

		// 랜덤값 : random() : 0.0~1.0까지의 double형 실수를 반환
		double dblResult = Math.random();
		System.out.println(dblResult);
		// 0부터 100까지의 정수값을 랜덤하게 출력
		int intResult = (int) (Math.random() * 100);
		System.out.println(intResult);

		System.out.println(Math.ceil(3.14)); // ceiling(천장) 위로(올림) : 3.14 => 4.0
		System.out.println(Math.floor(3.14)); // floor(바닥) 아래로(버림) : 3.14 = 3.0

	}
}
