import java.util.ArrayList;
import java.util.Iterator; 

public class ArrayListDemo {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30}; // length�� 3�� �������� �迭
		
		// ArrayList ��ü ����
		ArrayList al = new ArrayList();
		// add() �޼ҵ�� ������ �Է�
		al.add(10);
		al.add(20);
		al.add(new Integer(30));
		// ��� : size() : ����� ũ��, get(index) : �ش� ��
		for (int i = 0; i < al.size(); i++) {
			System.out.printf("%d\n", al.get(i));//
		}
		// Ư�� ��Ҹ� ���� : remove()
		al.remove(1); // 1��° �ε���
		// Ư�� �ε����� ���� �߰� : set(index, value)
		al.set(1, new Integer(200));
		// �ݺ��ؼ� ��� : Iterator(�ݺ���, �ݺ���)
		for (Iterator i = al.iterator(); i.hasNext(); ) {
			Integer integer = (Integer)i.next();
			System.out.println(integer);
		}
		// ������ �ٿ� ǥ�� ���
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer)itr.next();
			System.out.println(integer);
		}
	}
}
