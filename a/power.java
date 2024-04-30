package a;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double x= sc.nextInt();
        double n = sc.nextInt();

        
        double p=Math.pow( x, n);
        System.out.println(p);
    }
    
}
