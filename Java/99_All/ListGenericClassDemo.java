import java.util.ArrayList;
import java.util.List;

class ScoreClass {
	private int score;
	public ScoreClass(int score) {
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}

// List<T> 제네릭 클래스
public class ListGenericClassDemo {
	public static void main(String[] args) {
		// List of T : 리스트 제네릭 클래스의 인스턴스 생성
		List<Integer> myList = new ArrayList<Integer>();
		
		// add()
		myList.add(10);
		myList.add(new Integer(20));
		myList.add(30);
		
		// 컬렉션 출력 : foreach문
		for (Integer i : myList) {
			System.out.println(i);
		}
		
		// 사용자 정의 클래스 사용
		List<ScoreClass> scores = new ArrayList<ScoreClass>();
		
		scores.add(new ScoreClass(100));
		scores.add(new ScoreClass(90));
		scores.add(new ScoreClass(80));
		
		int sum = 0; // 총점
		double avg = 0.0; // 평균
		int cnt = 0; // 개수
		for (ScoreClass sc : scores) {
			sum += sc.getScore(); 
			cnt++;
		}
		avg = sum / (double)cnt;
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, avg);
	}
}
