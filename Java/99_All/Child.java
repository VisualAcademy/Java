// Parent Ŭ������ ��� ����� Child Ŭ������ ���
public class Child extends Parent {
	// ���� ������
	//private String data = "C : �ݰ����ϴ�. ";
	private String s = "�� ������.";	
	// ��� : �޼ҵ�
	public void hello() {
		System.out.println(
		    "Child : �ȳ��ϼ���. " 
		    + super.data 		// �θ��� ����� ����
		    + " " + this.s		// �� �ڽ��� ����� ����
		);
	}
}
