// ���׸� Ŭ����
class Box {
	private Integer i;
	public void set(Integer i) {
		this.i = i;
	}
	public Integer get() {
		return this.i;
	}	
}

class BoxAll<T> {
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return this.t;
	}		
}

public class GenericClassDemo {
	public static void main(String[] args) {
		// �⺻ Ŭ���� ȣ��
		Box box = new Box();
		box.set(new Integer(10));
		System.out.println("���� : " + box.get());
		
		// ���׸� Ŭ���� ȣ��
		BoxAll<Integer> ba = new BoxAll<Integer>();
		ba.set(new Integer(100));
		System.out.println("���� : " + ba.get());
		
		BoxAll<String> ba2 = new BoxAll<String>();
		ba2.set(new String("�ȳ��ϼ���."));
		System.out.println("���ڿ� : " + ba2.get());
	}
}
