// 조건연산자(3항연산자) => ? :
// (조건식) ? 참일때수행문자 : 거짓일때수행문장; 
public class OperatorThree {
    public static void main(String args[]) {
        int num = 9;
        String result = "";

        // 3항 연산자(if문 동일)
        result = (num % 2 == 0) ? "짝수" : "홀수";

        System.out.println(result);
    }
}

// C:\Java\OperatorThree>javac OperatorThree.java -encoding UTF8

// C:\Java\OperatorThree>java OperatorThree
// 홀수

// C:\Java\OperatorThree>javac OperatorThree.java -encoding UTF8

// C:\Java\OperatorThree>java OperatorThree
// 짝수

// C:\Java\OperatorThree>