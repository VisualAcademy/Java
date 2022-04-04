// switch 문: 선택문
public class SwitchExpressions {
    public static void main(String[] args) {
        int x = 2;

        // Java 14 이상에서 사용할 수 있는 switch expressions
        String message = switch (x) {
            case 1 -> "1입니다."; // x가 1일 때 실행
            case 2 -> "2입니다."; // x가 2일 때 실행
            default -> "기타";
        };

        System.out.println(message);
    }
}
