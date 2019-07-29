// ���� ���� Ŭ����
public class MathDemo {
	public static void main(String[] args) {

		System.out.println(Math.PI); // 3.14
		System.out.println(Math.abs(-10)); // ���밪 : 10
		System.out.println(Math.max(10, 20)); // �ִ� 20
		System.out.println(Math.min(10, 20)); // �ּڰ� 10
		System.out.println(Math.round(3.5415)); // �ݿø� 4
		
		// ���ڸ����� : ���� * 100 / 100.0
		double result = Math.round(3.156 * 100) / 100.0; // 3.16
		System.out.println(result);
		
		// 2 ^ 10
		System.out.println(Math.pow(2, 20)); // 1024, 1048576
		
		// ������ : random() : 0.0~1.0������ double�� �Ǽ��� ��ȯ
		double dblResult = Math.random();		
		System.out.println(dblResult);
		// 0���� 100������ �������� �����ϰ� ���
		int intResult = (int)(Math.random() * 100); 
		System.out.println(intResult);
		
		System.out.println(Math.ceil(3.14)); // ceiling(õ��) ����(�ø�) : 3.14=> 4.0
		System.out.println(Math.floor(3.14)); // floor(�ٴ�) �Ʒ���(����) : 3.14 = 3.0
		
	}
}
