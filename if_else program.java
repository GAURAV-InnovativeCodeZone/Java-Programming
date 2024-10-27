// if else program

import java.util.*;

class If_Else {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks scored by you : ");
        int marks = input.nextInt();
        input.close();

        if (marks >= 33)
        {
            System.out.println("'Congratultions!' You passed the exam.");
        } 
        else 
        {
            System.out.println("'Sorry!' You failed the exam.");
        }
    }
}
