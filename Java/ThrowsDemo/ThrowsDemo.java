// 사용자 정의 예외 처리ㅣ
class MyException extends Exception {
	public MyException(String msg) {
		super(msg); // 예외 문자열 전달
	}
}

public class ThrowsDemo {
	public static void main(String[] args) /*throws MyException*/ {
		try {
			System.out.println(divide(3, 0)); // 3 / 0 => X
		}
		catch (MyException me) {
			System.out.println(me.getMessage()); // 예외 메시지 출력
			me.printStackTrace(); // 예외 처리 단계 출력
		}
	}
	
	public static int divide(int a, int b) throws MyException {
		// 사용자 정의 예외 처리
		if (b == 0) {
			throw new MyException("0으로 나눌 수 없습니다.");
		}
		
		return a / b; 
	}
}
