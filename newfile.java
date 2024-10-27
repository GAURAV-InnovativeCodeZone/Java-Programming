
// Three digit sum & reverse

import java.util.Scanner;

public class sum_reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int rem, sum=0, rev=0;
        rem=num%10;
        rev=rev*10+rem;
        sum=sum+rem;
        num=num/10;
}
sc.close();
        System.out.println(" reverse of digit = "+rev);
        System.out.println("sum of digit = "+sum);
    }
}