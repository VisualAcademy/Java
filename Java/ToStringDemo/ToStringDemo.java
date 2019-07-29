class SelectionSort {
	// �ʵ�
	private int[] data; 
	// ������
	public SelectionSort(int[] data) {
		this.data = data; // this.�ʵ� = �Ű�����;
	}
	// �޼ҵ�
	public void sorting() {
		// ���� ���� �˰����� ����
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
	// �޼���
	public void print() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
	// toString() �޼ҵ� �������̵�(Override;������;���Ӱ�(New)����)
	public String toString() {
		return "���Ӱ� ���� ������ toString() �޼���";
	}
}

public class ToStringDemo {
	public static void main(String[] args) {
		//[1] Input
		int[] data = {3, 2, 5, 1, 4}; 
		//[2] Process
		SelectionSort ss = new SelectionSort(data);
		ss.sorting(); // �������� ����
		//[3] Output
		ss.print(); 
		//[4] �ν��Ͻ��� ���
		System.out.printf("%s %s\n", ss, ss.toString()); 
	}
}
