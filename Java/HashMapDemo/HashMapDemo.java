// HashMap 클래스 : 키(Key)와 값(Value)의 쌍으로 데이터 저장
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
	public static void main(String[] args) {
		// HashMap 클래스의 인스턴스 생성
		Map map = new HashMap();
		
		// 데이터 입력 : put()
		map.put(10, "One");
		map.put(20, "Two");
		map.put(30, "Three");
		map.put(10, "Four");
		map.put(20, "Five");
		map.put(30, "Six");
		map.put(60, "Seven");
		map.put(70, "Eight");
		
		// 키값 컬렉션 가져오기 
		Set keys = map.keySet(); 
		Iterator itr = keys.iterator(); // 키값이 있는 만큼 반복
		while (itr.hasNext()) {
			Integer key = (Integer)itr.next();
			String value = (String)map.get(key); // 데이터 조회 : get()
			System.out.printf("%d : %s\n", key, value);
		}
	}
}
