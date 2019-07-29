abstract class Animal {	// ���� Ŭ���� : base class
	abstract String cry(); // �������� ��ٶ�� ����� �����ؾ� ��
}
class Dog extends Animal {
	public String cry() {
		return "�۸۸�"; 
	}
}
class Crow extends Animal {
	public String cry() {
		return "��ǰ���"; 
	}
}
class Trainer {
	public void doCry(Animal animal) {
		// ���� : ���� ����? ������ Ÿ�� : �����? ��Ÿ�� : �Ѱܿ� �Ű�����
		System.out.println(animal.cry()); // ������:dynamic
	}	
}
// ������
public class PolymorphismDemo {
	public static void main(String[] args) {
		Dog dog = new Dog(); System.out.println(dog.cry()); 
		Crow crow = new Crow(); System.out.println(crow.cry()); 
		
		Animal ani1 = new Dog(); System.out.println(ani1.cry()); // �۸۸�
		Animal ani2 = new Crow(); System.out.println(ani2.cry()); // ���
		// ������ : ������ cry �޼���������, �Ѱ��� �޽����� ���� ���� �ٸ� ������ ����� ����
		// �������� �޼��� ���ٶ��̵�(override;�ٽ�����/������)�� ���ؼ� ���� 
		// 	<-> �����ε�(overload;����������)
		Trainer tra1 = new Trainer(); 
		tra1.doCry(new Dog()); // �۸۸� 
		tra1.doCry(new Crow()); // ��Ǳ��
	}
}
