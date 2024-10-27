// Print Two-Dimensional Array in tabular format
    
class TwoD_array4 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 5 }, { 3, 4, 7 } };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
