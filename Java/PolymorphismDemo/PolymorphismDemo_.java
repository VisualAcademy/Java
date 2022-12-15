abstract class Animal {	// 동물 클래스 : base class
	abstract String cry(); // 동물들은 울다라는 기능을 정의해야 함
}
class Dog extends Animal {
	public String cry() {
		return "멍멍멍"; 
	}
}
class Crow extends Animal {
	public String cry() {
		return "까악가악"; 
	}
}
class Trainer {
	public void doCry(Animal animal) {
		// 실행 : 뭐가 실행? 컴파일 타임 : 몰라요? 런타임 : 넘겨온 매개변수
		System.out.println(animal.cry()); // 다형성:dynamic
	}	
}
// 다형성
public class PolymorphismDemo {
	public static void main(String[] args) {
		Dog dog = new Dog(); System.out.println(dog.cry()); 
		Crow crow = new Crow(); System.out.println(crow.cry()); 
		
		Animal ani1 = new Dog(); System.out.println(ani1.cry()); // 멍멍멍
		Animal ani2 = new Crow(); System.out.println(ani2.cry()); // 까악
		// 다형성 : 동일한 cry 메서드이지만, 넘겨준 메시지에 따라서 서로 다른 유형의 기능을 구현
		// 다형성은 메서드 오바라이드(override;다시정의/재정의)를 통해서 구현 
		// 	<-> 오버로드(overload;여러번정의)
		Trainer tra1 = new Trainer(); 
		tra1.doCry(new Dog()); // 멍멍멍 
		tra1.doCry(new Crow()); // 까악까악
	}
}
