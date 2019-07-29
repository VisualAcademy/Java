
public class ThreadSleepDemo {
	public static void main(String[] args) {
	
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("카운트 : " + i);
				Thread.sleep(2000); // 2초간 현재 스레드 중지
			}
		}
		catch (InterruptedException ie) {
			System.out.println("예외 발생 : " + ie.getMessage());
		}
		
		// 현재 스레드에 대한 정보 출력
		Thread t = Thread.currentThread();
		System.out.println("현재 스레드 이름 : " + t.getName());
		
	}
}
