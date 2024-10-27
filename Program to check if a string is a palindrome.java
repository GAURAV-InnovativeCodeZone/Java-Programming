
   // Program to check if a string is a palindrome

import java.util.Scanner;
public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number OR word : ");
		String str=sc.nextLine();
		boolean isPalindrome = true;
		int length = str.length();
		for (int i = 0; i <= length / 2; i++) {
			if (str.charAt(i) != str.charAt(length-1- i))  {
				isPalindrome = false;
				break;
			}
         }
         if (isPalindrome) {
         	System.out.println(str + " is a palindrome.");
         	} else {
         		System.out.println(str + " is not a palindrome.");
         	   }
         }
}