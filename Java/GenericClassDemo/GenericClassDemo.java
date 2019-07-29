// 제네릭 클래스
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
		// 기본 클래스 호출
		Box box = new Box();
		box.set(new Integer(10));
		System.out.println("정수 : " + box.get());
		
		// 제네릭 클래스 호출
		BoxAll<Integer> ba = new BoxAll<Integer>();
		ba.set(new Integer(100));
		System.out.println("정수 : " + ba.get());
		
		BoxAll<String> ba2 = new BoxAll<String>();
		ba2.set(new String("안녕하세요."));
		System.out.println("문자열 : " + ba2.get());
	}
}
