import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetGenericClassDemo {
	public static void main(String[] args) {

		// Set/HashSet ���׸� Ŭ����
		Set<Integer> set = new HashSet<Integer>();
		
		// Set�� Ư¡ : �ߺ� ���� : ����
		set.add(10);
		set.add(new Integer(20));
		set.add(30);
		set.add(20);
		
		// ������
		System.out.println("���� : " + set.size());
		
		// ���
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.printf("%d\n", (Integer)itr.next());
		}
		
	}
}
