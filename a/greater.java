package a;

import java.util.Scanner;

public class greater {
    public static void graterNumber(int a, int b){
        if(a>b){
            System.out.println(a +" is greater number");

        }else{
            System.out.println(b+" is greater number");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        graterNumber(a, b);
    }
    
}
