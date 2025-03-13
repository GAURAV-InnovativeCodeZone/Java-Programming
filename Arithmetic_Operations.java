// addition, subtraction, multiplication, division of two number

import java.util.Scanner;
public class Arithmetic_Operations{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number a = ");
        int a = sc.nextInt();
        System.out.print("Enter second number b = ");
        int b = sc.nextInt();
        
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        float div = a / b;

        System.out.println("Addition of a+b = " +sum);
        System.out.println("Subtraction of a-b = " +sub);
        System.out.println("Multiplication of a*b = " +mul);
        System.out.println("Divison of a/b = " +div);
        sc.close();
    }
}
