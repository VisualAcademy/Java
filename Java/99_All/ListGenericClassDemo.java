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

// List<T> ���׸� Ŭ����
public class ListGenericClassDemo {
	public static void main(String[] args) {
		// List of T : ����Ʈ ���׸� Ŭ������ �ν��Ͻ� ����
		List<Integer> myList = new ArrayList<Integer>();
		
		// add()
		myList.add(10);
		myList.add(new Integer(20));
		myList.add(30);
		
		// �÷��� ��� : foreach��
		for (Integer i : myList) {
			System.out.println(i);
		}
		
		// ����� ���� Ŭ���� ���
		List<ScoreClass> scores = new ArrayList<ScoreClass>();
		
		scores.add(new ScoreClass(100));
		scores.add(new ScoreClass(90));
		scores.add(new ScoreClass(80));
		
		int sum = 0; // ����
		double avg = 0.0; // ���
		int cnt = 0; // ����
		for (ScoreClass sc : scores) {
			sum += sc.getScore(); 
			cnt++;
		}
		avg = sum / (double)cnt;
		System.out.printf("���� : %d, ��� : %.2f\n", sum, avg);
	}
}
