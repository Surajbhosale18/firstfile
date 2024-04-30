package a;

import java.util.Scanner;

public class sumofodd {

   public static void abc(int n){
    int a=0;
    for(int i=1; i<=n; i++){
        if(i%2!=0){
            a = a+i;

        }
       
    }
    System.out.println(a);
   }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    abc(n);
   }
    
}
