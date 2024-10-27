
// Three digit sum & reverse

import java.util.Scanner;

public class sum_reverse{

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the 3 digit number:");
                
                int n = sc.nextInt();
                int a = n % 10;
                n = n / 10;
                int b = n % 10;
                n = n / 10;
                int sum = a + b + n;
                int rev = a * 100 + b * 10 + n;

                System.out.println(" 3 digit number is " +sum);
                System.out.println(" 3 digit number reverse is " +rev);
                sc.close();
        }
}