// direct method to declare Two-Dimensional array

class TwoD_array2 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 } };
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);

    }
}
