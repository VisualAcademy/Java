import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetGenericClassDemo {
	public static void main(String[] args) {

		// Set/HashSet 제네릭 클래스
		Set<Integer> set = new HashSet<Integer>();
		
		// Set의 특징 : 중복 제거 : 집합
		set.add(10);
		set.add(new Integer(20));
		set.add(30);
		set.add(20);
		
		// 사이즈
		System.out.println("개수 : " + set.size());
		
		// 출력
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.printf("%d\n", (Integer)itr.next());
		}
		
	}
}
