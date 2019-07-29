import java.util.*; 

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		
		// 출력
		for (int i = 0; i < v.size(); i++) {
			Integer integer = (Integer)v.elementAt(i);
			System.out.printf("%d\n", integer);
		}
		
		// 요소 삭제
		v.remove(1); // 1번째 인덱스 삭제
		
		// 출력
		Iterator itr = v.iterator(); // 전체 레코드가 반환
		while (itr.hasNext()) {
			Integer integer = (Integer)itr.next();
			System.out.printf("%d\n", integer);
		}
		
	}
}
