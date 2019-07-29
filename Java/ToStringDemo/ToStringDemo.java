class SelectionSort {
	// 필드
	private int[] data; 
	// 생성자
	public SelectionSort(int[] data) {
		this.data = data; // this.필드 = 매개변수;
	}
	// 메소드
	public void sorting() {
		// 선택 정렬 알고리즘을 구현
		int temp = 0;
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}
	// 메서드
	public void print() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
	// toString() 메소드 오버라이드(Override;재정의;새롭게(New)정의)
	public String toString() {
		return "새롭게 만든 나만의 toString() 메서드";
	}
}

public class ToStringDemo {
	public static void main(String[] args) {
		//[1] Input
		int[] data = {3, 2, 5, 1, 4}; 
		//[2] Process
		SelectionSort ss = new SelectionSort(data);
		ss.sorting(); // 오름차순 정렬
		//[3] Output
		ss.print(); 
		//[4] 인스턴스명 출력
		System.out.printf("%s %s\n", ss, ss.toString()); 
	}
}
