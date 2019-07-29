import java.util.LinkedList;
import java.util.Queue;

public class QueueGenericClassDemo {
	public static void main(String[] args) {
	
		// Queue Ŭ���� : ���Լ���(FIFO) <> LIFO(Stack)
		Queue<String> myQueue = new LinkedList<String>();
		
		// Queue�� �� ���� : offer()
		myQueue.offer("AAA");
		myQueue.offer("BBB");
		myQueue.offer("CCC");
		
		// Queue�� ����� �� ��� : poll(), Ȯ�� : peek()
		while (myQueue.peek() != null) {
			System.out.println(myQueue.poll());
		}
		
	}
}
