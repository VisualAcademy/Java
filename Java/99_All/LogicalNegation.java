//[?] 논리 부정 연산자: !
public class LogicalNegation {
    public static void main(String[] args) {
        boolean bln = false;

        System.out.println(!bln); // true
        System.out.println(!!bln); // false
        System.out.println(!(!(!bln))); // true
    }
}
