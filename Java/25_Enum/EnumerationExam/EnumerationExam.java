//[?] 열거형(Enumeration): 하나의 이름으로 서로 관련있는 정수 값을 갖는 상수 집합을 정의

// Color 열거형
enum Color {
    Red,
    Green,
    Blue
}

public class EnumerationExam {
    public static void main(String[] args) {
        System.out.println(Color.Red.ordinal()); // 0
        System.out.println(Color.Green.ordinal()); // 1
        System.out.println(Color.Blue.ordinal()); // 2
    }
}
