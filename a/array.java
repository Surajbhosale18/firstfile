package a;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] marks= new int[size];

       for(int i=0; i<size; i++){
        marks[i]=sc.nextInt();
       }

        
        
        // marks[0]= 49;
        // marks[1]= 50;
        // marks[2]= 4;




        for(int i=0; i<size; i++){
            System.out.println(marks[i]);
        }

        
    }
    
}
