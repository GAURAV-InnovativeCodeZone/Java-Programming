// sum of array element

import java.util.Scanner;

public class sum_of_array {

    public static void main(String args[]) {
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        
        System.out.println("Enter the element of array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("array elements are --- ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
            sum = sum + a[i];
        }
        System.out.println("Sum of the elements = " +sum);
    }
}
