import java.util.LinkedList;
import java.util.Queue;

public class QueueGenericClassDemo {
	public static void main(String[] args) {
	
		// Queue 클래스 : 선입선출(FIFO) <> LIFO(Stack)
		Queue<String> myQueue = new LinkedList<String>();
		
		// Queue에 값 대입 : offer()
		myQueue.offer("AAA");
		myQueue.offer("BBB");
		myQueue.offer("CCC");
		
		// Queue에 저장된 값 출력 : poll(), 확인 : peek()
		while (myQueue.peek() != null) {
			System.out.println(myQueue.poll());
		}
		
	}
}
