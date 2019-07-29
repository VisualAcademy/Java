// String.format() 메서드: 문자열 연결 관련 주요 기능 제공
public class StringFormatDemo
{
    public static void main(String args[])
    {
        String msg = String.format("%s님, %s", "홍길동", "안녕하세요.");
        System.out.println(msg); // 홍길동님, 안녕하세요.
    }    
}
