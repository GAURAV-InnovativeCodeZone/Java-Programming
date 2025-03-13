import java.util.Scanner;

class ArrayEvenOddSum {

    public static void main(String[] args) {

        int size, i, evenSum = 0, oddSum = 0;
        try (Scanner sc = new Scanner(System.in)) {

            // Input: Array size
            System.out.print("Please Enter the Number of elements in the array: ");
            size = sc.nextInt();

            int[] a = new int[size];

            // Input: Array elements
            System.out.print("Please Enter " + size + " elements of the array: \n");
            for (i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }

            // Logic: Calculate sum of even numbers and odd numbers
            for (i = 0; i < size; i++) {
                if (a[i] % 2 == 0) {
                    evenSum += a[i]; // Sum of even numbers
                } else {
                    oddSum += a[i]; // Sum of odd numbers
                }
            }

            // Output: Sum of even numbers
            System.out.println("\nThe Sum of Even Numbers in the Array = " + evenSum);

            // Output: Sum of odd numbers
            System.out.println("The Sum of Odd Numbers in the Array = " + oddSum);

        }
    }
}
