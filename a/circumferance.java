package a;

import java.util.Scanner;

public class circumferance {
    public static double circumfereance(double radius){
        double circum=0;
        circum = 2*3.14*radius;
        System.out.println(circum);
        return circum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double radius= sc.nextDouble();
        circumfereance(radius);
    }
    
}
