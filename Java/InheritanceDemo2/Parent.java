
public class Parent // extends Object
{
	// ���� ������
	protected String data = "P : �ݰ����ϴ�. ";	
	// ��� : �޼ҵ�
	public void hi() {
		System.out.println("Parent : �ȳ��ϼ���.");
	}
	// ����������(Access Modifier)
	// ��� : �ʵ� : public(����)
	public String msg; // Child, InheritanceDemo ���ٰ���
	// �θ� -> �ڽ� Ŭ�������Ը� ��� ���� : protected(���)
	protected String securityData;
	// �θ� �ڽŸ��� ��� : private(����)
	private String mySecurity; 
}
