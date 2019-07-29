class ThreadClass extends Thread {
	public ThreadClass() {
		
	}
	public ThreadClass(String name) {
		super.setName(name); // ������ �̸� ����
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " : " + i);
		}
	}
}

public class ThreadClassDemo {
	public static void main(String[] args) {
		// Thread Ŭ������ �ν��Ͻ� ����
		ThreadClass tc1 = new ThreadClass("ù��°"); //tc.run();
		ThreadClass tc2 = new ThreadClass("�ι�°"); 

		// ������ ��ü ���� : start() : ���ο� ������ ���� �� �ش� �����忡 �ִ� run() ȣ��
		tc1.start(); 
		tc2.start(); 
	}
}
