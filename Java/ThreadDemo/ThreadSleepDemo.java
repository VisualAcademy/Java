
public class ThreadSleepDemo {
	public static void main(String[] args) {
	
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("ī��Ʈ : " + i);
				Thread.sleep(2000); // 2�ʰ� ���� ������ ����
			}
		}
		catch (InterruptedException ie) {
			System.out.println("���� �߻� : " + ie.getMessage());
		}
		
		// ���� �����忡 ���� ���� ���
		Thread t = Thread.currentThread();
		System.out.println("���� ������ �̸� : " + t.getName());
		
	}
}
