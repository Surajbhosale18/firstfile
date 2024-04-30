package a;

import java.util.Scanner;

public class diviser {
    public static void div(int a, int b){
        int[] myArray = new int[20];
        int index=0;

        for(int i=1; i<=a ; i++){
            if(a%i==0 && b%i==0){
                myArray[index]=i;
                index++;
                


            }
            System.out.println(myArray[index]);
        }


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        div(a, b);
    }
    
}
