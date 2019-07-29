public class Algorithm_FillArray_Row {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int value = 0;
        int row = 0, col = 0;
        // 배열 채우기: 행 우선
        while (col < 5) {
            row = 0; 
            while (row < 5) {
                value = value + 1;
                arr[row][col] = value; 
                row = row + 1;
            }
            col = col + 1; 
        }
        // 배열 값 출력 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
