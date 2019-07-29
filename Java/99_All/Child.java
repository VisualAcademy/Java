// Parent 클래스의 모든 기능을 Child 클래스에 상속
public class Child extends Parent {
	// 공용 데이터
	//private String data = "C : 반갑습니다. ";
	private String s = "또 만나요.";	
	// 멤버 : 메소드
	public void hello() {
		System.out.println(
		    "Child : 안녕하세요. " 
		    + super.data 		// 부모의 멤버에 접근
		    + " " + this.s		// 나 자신의 멤버에 접근
		);
	}
}
