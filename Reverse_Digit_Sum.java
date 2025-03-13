
// Reverse of digit & their sum

import java.util.Scanner;

public class Reverse_Digit_Sum {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter any number : ");
              int num = sc.nextInt();
              int rem, sum = 0, rev = 0;
              while (num != 0) {
                     rem = num % 10;
                     rev = rev * 10 + rem;
                     sum = sum + rem;
                     num = num / 10;
                     sc.close();
              }
              System.out.println("Reverse of digit = " + rev);
              System.out.println("Sum of digit = " + sum);
       }
}