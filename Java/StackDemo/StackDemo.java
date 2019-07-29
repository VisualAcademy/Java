import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		// Stack Ŭ������ �ν��Ͻ� ����
		Stack stack = new Stack();
		
		// ������ �Է� : LIFO(Last In First Out)
		stack.push(10);
		stack.push(new Integer(20)); // wrapper Ŭ����
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		// ������ ��� : Stack�� ����ִ� ��ŭ �ݺ� : Stack.empty()
		while (!stack.empty()) {
			System.out.printf("%d\n", (Integer)stack.pop());
		}
		
	}
}
