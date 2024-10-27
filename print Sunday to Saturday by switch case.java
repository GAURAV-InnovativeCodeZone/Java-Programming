// print 1-7 numner and print Sunday to Saturday by switch case

import java.util.Scanner;

class print_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int day = sc.nextInt();
        sc.close();

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}