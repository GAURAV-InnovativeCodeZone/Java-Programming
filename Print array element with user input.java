// print array element with user input

import java.util.Scanner;

class array{
    public static void main(String[] args){
        System.out.print("Enter the size of array : ");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.println("Enter the element of array : ");
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Array elements are --- "); 
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
