// Indirect Method to Declare of Three-Dimensional Array

class ThreeD_array2 {
    public static void main(String[] args) {
        int[][][] arr = new int[10][20][30];
        arr[0][0][0] = 1;
        System.out.println("arr[0][0][0] = " + arr[0][0][0]);
    }
}