// 예외처리: try~catch~finally 
public class TryCatchFinallyDemo
{
    public static void main(String args[])
    {
        System.out.println("[1] 열기");
        
        // 예외가 발생할 만한 코드를 작성
        try 
        {
            System.out.println("[2] 사용");
            // 인위적으로 에러 발생시키기
            throw new Exception(); // 비정상 종료
        }
        // 예외가 발생할 때 처리해야 할 코드 블록
        catch(Exception ex) 
        {
            System.out.println("[!] 정상 종료");
        }
        // 예외가 발생하거나 정상일 때 모두 처리해야 할 코드 블록
        finally 
        {
            System.out.println("[3] 닫기");
        }
    }    
}
