// HashMap Ŭ���� : Ű(Key)�� ��(Value)�� ������ ������ ����
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
	public static void main(String[] args) {
		// HashMap Ŭ������ �ν��Ͻ� ����
		Map map = new HashMap();
		
		// ������ �Է� : put()
		map.put(10, "One");
		map.put(20, "Two");
		map.put(30, "Three");
		map.put(10, "Four");
		map.put(20, "Five");
		map.put(30, "Six");
		map.put(60, "Seven");
		map.put(70, "Eight");
		
		// Ű�� �÷��� �������� 
		Set keys = map.keySet(); 
		Iterator itr = keys.iterator(); // Ű���� �ִ� ��ŭ �ݺ�
		while (itr.hasNext()) {
			Integer key = (Integer)itr.next();
			String value = (String)map.get(key); // ������ ��ȸ : get()
			System.out.printf("%d : %s\n", key, value);
		}
	}
}
