package a;

import java.util.Scanner;

public class circum {
    public static double cirl(double radius){
        double circumferance;
        circumferance=2*Math.PI*radius;
        System.out.println(circumferance);
        return circumferance;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double radius=sc.nextDouble();

        cirl(radius);
    }
}
