// Ŭ���� : Type, ����, �з� ����
// Dog Ŭ����
class Dog {
	private String name;							// �̸� �ʵ�(��ǰ)
	public Dog(String name) {						// �̸� �Ű������� �޴� ������(�ʵ� �ʱ�ȭ)
		this.name = name;							// name �ʵ忡 �Ѱܿ� name �Ű����� �Է�		
	}
	public String Cry() {							// Cry �޼��� ����
		return this.name + "��(��) �۸۸� �����ϴ�.";
	}
}

public class ClassAndInstance {
	public static void main(String[] args) {
		// �ν��Ͻ�(��ü/��ü) : ���ο� ��ü, ��ü���� �� ����
		// Dog Ŭ�����κ��� Dog�� ����
		Dog happy = new Dog("����");
		System.out.println(happy.Cry());
		
		Dog worry = new Dog("����");
		System.out.println(worry.Cry());
	}
}
