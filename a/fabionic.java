package a;

import java.util.Scanner;

public class fabionic {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();

int a=0;
int b=1;

    for(int i=2; i<=n; i++){
        

        System.out.print(b+" ");

        int temp = b;
               b = a + b;
               a = temp;

        

        

    }
    System.out.println();

}
    
}
