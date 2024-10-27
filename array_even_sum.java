// print array odd or not

import java.util.Scanner;

public class array_even_sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Size, i, EvenSum = 0;

        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();
        int[] a = new int[Size];

        System.out.print(" Please Enter " + Size + " elements of an Array : ");
        for (i = 0; i < Size; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < Size; i++) {
            if (a[i] % 2 == 0) {
                EvenSum = EvenSum + a[i];
            }
        }
        System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
    }
}