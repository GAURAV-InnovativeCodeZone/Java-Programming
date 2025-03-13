
  // Program to check whether a provided number is prime or not

import java.util.Scanner;
public class PrimeChecker{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number=sc.nextInt(); // Number to be checked for primality
		boolean isPrime = true;
		if (number <= 1) {
			isPrime = false;
			} else {
				for (int i = 2; i <= Math.sqrt(number); i++) {
					if (number % i == 0) {
						isPrime = false;
						break;
					}
           }
		   sc.close();
  }
  if (isPrime) {
  	System.out.println(number + " is a prime number.");
  	} else {
  		System.out.println(number + " is not a prime number.");
  		}
    }
}