import static java.lang.System.out;

public class NumberTypeDemo {

    public static void main(String[] args) {
        out.println("자바의 숫자 데이터 형식");

        byte b = 127;
        short s = 32767; 
        int i = 2100000000;
        long l = 2200000000L;

        float f = 3.14f;
        double d = 3.141592;

        out.println("정수: " + b + ", " + s + ", " + i + ", " + l);
        out.println("실수: " + f + ", " + d);
    }
}
