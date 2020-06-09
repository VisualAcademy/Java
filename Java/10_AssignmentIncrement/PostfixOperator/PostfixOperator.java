// 후위(Postfix) 증감 연산자: 우선순위가 낮음
public class PostfixOperator {
    public static void main(String[] args) {
        int x = 3;

        int y = x++;

        System.out.println(y); // 3
        System.out.println(x); // 4
    }
}
