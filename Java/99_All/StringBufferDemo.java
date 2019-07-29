// StringBuffer 클래스: 문자열 묶고 추가 또는 삭제 등의 명령어 제공
public class StringBufferDemo
{
    public static void main(String args[])
    {
        //[!] StringBuffer 클래스: 긴 문자열 묶을 때 효과적
        //[1] 50자 정도의 문자열을 받을 수 있는 그릇(버퍼) 생성 
        StringBuffer sb = new StringBuffer(50);

        //[2] 문자열 추가
        sb.append("안녕하세요.");

        //[3] 문자열 입력
        sb.insert(0, "홍길동님, ");        

        //[4] 문자열 출력
        System.out.println(sb + ": " + sb.length());
    }
}
