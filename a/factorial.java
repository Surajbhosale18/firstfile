package a;

import java.util.*;



public class factorial {
    public static void fac(int a){
        if(a<0){
            System.out.println("invalid number");
            return;-
        }
        int fact=1;
        for(int num=1; num<=a; num++){
            fact= fact*num;
        }
        System.out.println(fact);
    }
    

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int a = sc.nextInt();
        fac(a);
    }
}