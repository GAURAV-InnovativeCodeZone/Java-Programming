// print array elements is an odd or not

import java.util.Scanner;

class odd_array {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in); // Take input from the user

      System.out.print("Enter the size of the array: ");
      int n = sc.nextInt(); // Intialize the array size

      int arr[] = new int[n]; // Declare an array
      System.out.print("Enter the array elements: ");
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt(); // Initialize the array elements
      }
      sc.close();

      System.out.println("The Odd Elements are..."); // Print the odd elements
      for (int i = 0; i < n; i++) {
         if (arr[i] % 2 != 0) { // check whether odd or not
            System.out.print(arr[i] + "  ");
         }
      }
   }
}