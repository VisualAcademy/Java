
public class Parent // extends Object
{
	// 공용 데이터
	protected String data = "P : 반갑습니다. ";	
	// 멤버 : 메소드
	public void hi() {
		System.out.println("Parent : 안녕하세요.");
	}
	// 접근한정자(Access Modifier)
	// 멤버 : 필드 : public(공용)
	public String msg; // Child, InheritanceDemo 접근가능
	// 부모 -> 자식 클래스에게만 멤버 노출 : protected(상속)
	protected String securityData;
	// 부모 자신만의 비밀 : private(전용)
	private String mySecurity; 
}
