import java.util.ArrayList;
import java.util.Iterator; 

public class ArrayListDemo {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30}; // length가 3인 고정길이 배열
		
		// ArrayList 개체 생성
		ArrayList al = new ArrayList();
		// add() 메소드로 데이터 입력
		al.add(10);
		al.add(20);
		al.add(new Integer(30));
		// 출력 : size() : 요소의 크기, get(index) : 해당 값
		for (int i = 0; i < al.size(); i++) {
			System.out.printf("%d\n", al.get(i));//
		}
		// 특정 요소를 제거 : remove()
		al.remove(1); // 1번째 인덱스
		// 특정 인덱스에 값을 추가 : set(index, value)
		al.set(1, new Integer(200));
		// 반복해서 출력 : Iterator(반복기, 반복자)
		for (Iterator i = al.iterator(); i.hasNext(); ) {
			Integer integer = (Integer)i.next();
			System.out.println(integer);
		}
		// 교과서 다운 표현 방법
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer)itr.next();
			System.out.println(integer);
		}
	}
}
