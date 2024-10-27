// Print Two-Dimensional Array in tabular format

class ThreeD_array4 {
    public static void main(String[] args) {
        int[][][] arr = { { { 1, 2 }, { 3, 4 } },
                { { 5, 6 }, { 7, 8 } } };
        for (int i = 0; i < 2; i++) {            //  where (i) is an number of array
            for (int j = 0; j < 2; j++) {        //  where (j) is an number of row
                for (int k = 0; k < 2; k++) {    //  where (k) is an number of column
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
