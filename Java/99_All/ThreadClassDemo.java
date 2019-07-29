class ThreadClass extends Thread {
	public ThreadClass() {
		
	}
	public ThreadClass(String name) {
		super.setName(name); // 스레드 이름 설정
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " : " + i);
		}
	}
}

public class ThreadClassDemo {
	public static void main(String[] args) {
		// Thread 클래스의 인스턴스 생성
		ThreadClass tc1 = new ThreadClass("첫번째"); //tc.run();
		ThreadClass tc2 = new ThreadClass("두번째"); 

		// 스레드 객체 실행 : start() : 새로운 스레드 생성 후 해당 스레드에 있는 run() 호출
		tc1.start(); 
		tc2.start(); 
	}
}
