
   // Program to print the Fibonacci series up to n terms

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10; // Number of terms
		int firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series (First " + n + "terms):");
		          for (int i = 1; i <= n; i++) {
		           System.out.print(firstTerm + " ");    int nextTerm = firstTerm + secondTerm;         firstTerm = secondTerm;
	     secondTerm = nextTerm;
           }
      }
}