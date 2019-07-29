import java.util.*; 

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		
		// ���
		for (int i = 0; i < v.size(); i++) {
			Integer integer = (Integer)v.elementAt(i);
			System.out.printf("%d\n", integer);
		}
		
		// ��� ����
		v.remove(1); // 1��° �ε��� ����
		
		// ���
		Iterator itr = v.iterator(); // ��ü ���ڵ尡 ��ȯ
		while (itr.hasNext()) {
			Integer integer = (Integer)itr.next();
			System.out.printf("%d\n", integer);
		}
		
	}
}
