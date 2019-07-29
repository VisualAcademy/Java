//[!] 상수(Constant): 변하지 않는 변수, 읽기 전용 변수
public class Constant
{
    public static void main(String args[])
    {
        //[1] 상수 선언과 동시에 초기화 
        final double PI = 3.14;
        final String SITE_NAME = "자바캠퍼스";

        //[2] 상수 참조
        System.out.println(PI); // 3.14
        System.out.println(SITE_NAME); // 자바캠퍼스 
    }
}
