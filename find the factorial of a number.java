
// Program to find the factorial of a number

import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
			System.out.println("Factorial of "+num+" is " + factorial);
	}
}