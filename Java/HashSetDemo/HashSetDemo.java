import java.util.Set; 
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(40));

		// Ãâ·Â
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer)itr.next();
			System.out.printf("%d\n", integer);
		}
	}
}
