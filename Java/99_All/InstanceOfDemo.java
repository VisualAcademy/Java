// instanceof ������
class Parent {
	
}
class Child1 extends Parent {
	
}
class Child2 extends Parent {
	
}

public class InstanceOfDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		// Ư�� Ŭ������ �ν��Ͻ����� �ƴ����� Ȯ��? instanceof
		if (p instanceof Parent) {
			System.out.println("p ��ü�� Parent Ŭ������ �ν��Ͻ��̴�.");
		}
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		if (c1 instanceof Parent) {
			System.out.println("c1 ��ü�� Parent Ŭ������ �ν��Ͻ��̴�.");
		}
		if (c2 instanceof Parent) {
			System.out.println("c2 ��ü�� Parent Ŭ������ �ν��Ͻ��̴�.");
		}
		if (p instanceof Child1) {
			System.out.println("p ��ü�� Child1 Ŭ������ �ν��Ͻ��̴�.");
		}
		else {
			System.out.println("p ��ü�� Child1 Ŭ������ �ν��Ͻ��� �ƴմϴ�.");			
		}
	}
}
