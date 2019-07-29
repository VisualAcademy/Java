// 클래스 : Type, 종류, 분류 정의
// Dog 클래스
class Dog {
	private String name;							// 이름 필드(부품)
	public Dog(String name) {						// 이름 매개변수를 받는 생성자(필드 초기화)
		this.name = name;							// name 필드에 넘겨온 name 매개변수 입력		
	}
	public String Cry() {							// Cry 메서드 구현
		return this.name + "이(가) 멍멍멍 짓습니다.";
	}
}

public class ClassAndInstance {
	public static void main(String[] args) {
		// 인스턴스(개체/객체) : 새로운 실체, 구체적인 것 정의
		// Dog 클래스로부터 Dog를 생성
		Dog happy = new Dog("해피");
		System.out.println(happy.Cry());
		
		Dog worry = new Dog("워리");
		System.out.println(worry.Cry());
	}
}
