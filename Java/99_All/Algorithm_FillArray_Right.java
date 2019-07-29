public class Algorithm_FillArray_Right {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int value = 1; int row = 0; int col = 0; 
        while (row < 5) {
            col = row; 
            while (col < 5) {
                arr[row][col] = value;
                value = value + 1;
                col = col + 1; 
            }
            row = row + 1;             
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
