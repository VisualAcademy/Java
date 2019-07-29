import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Map/HashMap ���׸� Ŭ����

public class MapGenericClassDemo {
	public static void main(String[] args) {
		Map<Integer, String> stu = 
				new HashMap<Integer, String>();
		
		stu.put(1, "ȫ�浿");
		stu.put(new Integer(2), new String("��λ�"));
		stu.put(3, "�Ѷ��");
		
		// �����͸� ��ȸ�ؼ� ���
		System.out.println("���۾����� ��� : " + stu.get(1));
		System.out.println("���۾����� ��� : " + stu.get(2));
		System.out.println("���۾����� ��� : " + stu.get(3));
		
		// Iterator : �ݺ���(�ݺ���)
		Iterator<Integer> keys = stu.keySet().iterator();
		while (keys.hasNext()) {
			Integer currentKey = keys.next();
			System.out.printf("%d : %s\n", 
					currentKey, stu.get(currentKey));
		}
	}
}
