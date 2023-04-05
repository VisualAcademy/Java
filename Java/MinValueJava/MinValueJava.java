public class MinValueJava {
    // findMin() 메서드 설계
    public static int findMin(int[] data, int n) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (data[i] < min) {
                min = data[i]; // 작은 데이터로 재 초기화
            }
        }
        
        return min;
    }

    public static void main(String[] args) {
        //[1] Init
        //[2] Input
        int[] data = { -10, -30, -20, -5, -15 };
        int n = data.length;
        //[3] Process: 최솟값만 구해라!!!
        int min = findMin(data, n);
        //[4] Output
        System.out.println("최솟값: " + min); // -30
    }
}