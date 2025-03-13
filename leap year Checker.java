// leap year or not

import java.util.Scanner;

class Leap_Year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int input = sc.nextInt();
        sc.close();

        if (input % 4 == 0) {
            System.out.println(input+ " is a leap year");
        } else {
            System.out.println(input+ " is not leap year");
        }
    }
}
