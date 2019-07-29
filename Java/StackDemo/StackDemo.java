import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		// Stack 클래스의 인스턴스 생성
		Stack stack = new Stack();
		
		// 데이터 입력 : LIFO(Last In First Out)
		stack.push(10);
		stack.push(new Integer(20)); // wrapper 클래스
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		// 데이터 출력 : Stack이 비어있는 만큼 반복 : Stack.empty()
		while (!stack.empty()) {
			System.out.printf("%d\n", (Integer)stack.pop());
		}
		
	}
}
