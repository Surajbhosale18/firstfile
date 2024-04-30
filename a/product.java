package a;

import java.util.Scanner;

public class product {
    public static int multi(int a , int b){
        int prod= a*b;
        return prod;

    }
     
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
 int prod=multi(a, b);4
        System.out.println("product of two numbers is "+ prod);
    }
    
}
