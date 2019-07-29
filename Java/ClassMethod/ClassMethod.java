class MyMath {
    public void sum(int x, int y) {
        int s = x + y;
        System.out.println(s);
    }
}

public class ClassMethod {
    public static void main(String[] args) {
        MyMath myMath = new MyMath(); 
        myMath.sum(3, 5); // 8
    }
}
