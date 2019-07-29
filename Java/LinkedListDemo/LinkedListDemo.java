import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		// LinkedList => LinkedList<T>
		LinkedList ll = new LinkedList();
		
		ll.add(new Character('a'));	
		ll.add(new Character('b'));	
		ll.add(new Character('c'));
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		// 반복자를 통한 출력
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			Character c = ((Character)itr.next()).charValue();
			System.out.println(c); 
		}
		
	}
}
