public class TimesTables {
    public static void main(String[] args) {
        // 행 반복: 1~9
        for (int i = 1; i <= 9; i++) {
            // 열 반복: 2~9
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + String.format("%2s  ", (j * i)));
            }
            System.out.println(); // 줄바꿈
        }
    }
}
