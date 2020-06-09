public class SwapDemo {
    public static void main(String[] args) {
        var i = 100;
        var j = 200;

        System.out.println("처음: " + i + ", " + j);
        
        // 변숫값 서로 바꾸기
        var temp = i;
        i = j;
        j = temp;

        System.out.println("변경: " + i + ", " + j);
    }
}
