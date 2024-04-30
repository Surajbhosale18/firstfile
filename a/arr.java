package a;

import java.util.Scanner;

public class arr {

    public static void main(String[] args) {
        // declaring array
        int myArray[]= new int[6];
        //taking input from user
        Scanner sc= new Scanner(System.in);

        //loop for storing and storing input in array from user

        for(int i=0; i<6; i++){
            myArray[i]=sc.nextInt();
        }


        System.out.println("enter the searching number");

        int a= sc.nextInt();

        for(int i=0; i<6; i++){
            if(myArray[i]==a){
                System.out.println(i);
            }
        }
        

    }
    
}
