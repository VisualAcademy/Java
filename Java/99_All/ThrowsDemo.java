// ����� ���� ���� ó����
class MyException extends Exception {
	public MyException(String msg) {
		super(msg); // ���� ���ڿ� ����
	}
}

public class ThrowsDemo {
	public static void main(String[] args) /*throws MyException*/ {
		try {
			System.out.println(divide(3, 0)); // 3 / 0 => X
		}
		catch (MyException me) {
			System.out.println(me.getMessage()); // ���� �޽��� ���
			me.printStackTrace(); // ���� ó�� �ܰ� ���
		}
	}
	
	public static int divide(int a, int b) throws MyException {
		// ����� ���� ���� ó��
		if (b == 0) {
			throw new MyException("0���� ���� �� �����ϴ�.");
		}
		
		return a / b; 
	}
}
