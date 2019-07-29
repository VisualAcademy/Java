import java.util.Set; 
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(40));

		// ��� : TreeSet�� ��������(Ascending)���� ���
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer)itr.next();
			System.out.printf("%d\n", integer);
		}
	}
}
