//[?] instanceof 연산자:
// 특정 변수 또는 개체가 특정 클래스의 인스턴스인지 확인
public class InstanceOf {
    public static void main(String[] args) {
        String s = "안녕하세요.";

        if (s instanceof java.lang.String) {
            System.out.println("s는 문자열입니다.");
        }
    }
}
