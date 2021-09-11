// instanceof 연산자
class Parent {
	
}
class Child1 extends Parent {
	
}
class Child2 extends Parent {
	
}

public class InstanceOfDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		// 특정 클래스의 인스턴스인지 아닌지를 확인? instanceof
		if (p instanceof Parent) {
			System.out.println("p 객체는 Parent 클래스의 인스턴스이다.");
		}

		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		if (c1 instanceof Parent) {
			System.out.println("c1 객체는 Parent 클래스의 인스턴스이다.");
		}
		if (c2 instanceof Parent) {
			System.out.println("c2 객체는 Parent 클래스의 인스턴스이다.");
		}
		
		if (p instanceof Child1) {
			System.out.println("p 객체는 Child1 클래스의 인스턴스이다.");
		}
		else {
			System.out.println("p 객체는 Child1 클래스의 인스턴스가 아닙니다.");			
		}
	}
}
