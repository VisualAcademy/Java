import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Map/HashMap 제네릭 클래스

public class MapGenericClassDemo {
	public static void main(String[] args) {
		Map<Integer, String> stu = 
				new HashMap<Integer, String>();
		
		stu.put(1, "홍길동");
		stu.put(new Integer(2), new String("백두산"));
		stu.put(3, "한라산");
		
		// 데이터를 조회해서 출력
		System.out.println("수작업으로 출력 : " + stu.get(1));
		System.out.println("수작업으로 출력 : " + stu.get(2));
		System.out.println("수작업으로 출력 : " + stu.get(3));
		
		// Iterator : 반복자(반복기)
		Iterator<Integer> keys = stu.keySet().iterator();
		while (keys.hasNext()) {
			Integer currentKey = keys.next();
			System.out.printf("%d : %s\n", 
					currentKey, stu.get(currentKey));
		}
	}
}
