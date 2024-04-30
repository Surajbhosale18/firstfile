 package a;

import java.util.Scanner;

public class average {

    //Enter 3 numbers from the user & make a function to print their average.

    public static void avg(int a, int b, int c){
        int sum=a+b+c;
        System.out.println(sum);

    }

   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    avg(a, b, c);


   }


    
}