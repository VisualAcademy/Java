// 이미 만들어져 있는 패키지 추가
//import java.util.Date;
//import java.lang.*; // 생략가능
import java.util.Date;
//import MyPackage.MyClass;
import MyPackage.*;

public class PackageUsingDemo {

	public static void main(String[] args) {

		// 현재 시간을 출력 : 패키지경로.클래스명 형태로 호출
		java.util.Date t = new java.util.Date();
		System.out.println(t); 
		
		// import 구문으로 상단에 패키지 삽입 후 클래스명으로만 접근
		Date t2 = new Date(); 	// Ctrl+Shift+O로 패키지 자동 import
		System.out.println(t2);
		
		// 기본 형식 들은 어디에? java.lang.*; 
		String s = new String("안녕하세요.");
		System.out.println(s);
		
		// 기본 형식도 패키지명.클래스명으로 접근 가능
		java.lang.String s2 = new java.lang.String("반갑습니다.");
		System.out.println(s2);
		
		// 다른 패키지의 클래스에 접근
		MyClass mc = new MyClass();
	}

}
