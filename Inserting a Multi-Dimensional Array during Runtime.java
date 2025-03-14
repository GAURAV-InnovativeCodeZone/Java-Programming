// Inserting a Multi-Dimensional Array during Runtime

import java.util.Scanner;

class Multi_Dimensional_Array {
    public static void main(String[] args) {
        System.out.println("Enter the numbers .....");
        
        // Scanner class to take values from console
        Scanner scanner = new Scanner(System.in);
        // totalTestCases = total number of TestCases
        // eachTestCaseValues = values in each TestCase as an Array values
        int totalTestCases, eachTestCaseValues;
        // takes total number of TestCases as integer number
        totalTestCases = scanner.nextInt();
        // An array is formed as row values for total testCases
        int[][] arrayMain = new int[totalTestCases][];

        // for loop to take input of values in each TestCase
        for (int i = 0; i < arrayMain.length; i++) {
            eachTestCaseValues = scanner.nextInt();
            arrayMain[i] = new int[eachTestCaseValues];
            for (int j = 0; j < arrayMain[i].length; j++) {
                arrayMain[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        // All input entry is done.

        // Start executing output according to condition provided
        for (int i = 0; i < arrayMain.length; i++) {
            // Initialize total number of even & odd numbers to zero
            int nEvenNumbers = 0, nOddNumbers = 0;
            // prints TestCase number with total number of its arguments
            System.out.println("TestCase " + i + " with "
                    + arrayMain[i].length
                    + " values:");
            for (int j = 0; j < arrayMain[i].length; j++) {
                System.out.print(arrayMain[i][j] + " ");
                // even & odd counter updated as eligible number is found
                if (arrayMain[i][j] % 2 == 0) {
                    nEvenNumbers++;
                } else {
                    nOddNumbers++;
                }
            }
            System.out.println();
            // Prints total numbers of even & odd
            System.out.println("Total Even Numbers : " + nEvenNumbers + " ,Total Odd Numbers : " + nOddNumbers);
        }
    }
}
