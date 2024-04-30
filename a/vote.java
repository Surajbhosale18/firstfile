package a;

import java.util.Scanner;

public class vote {

    public static void person(int age){
        if(age >=18){
            System.out.println("you are elgible for voting");
        }
        else{
            System.out.println("not eligble for voting");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        person(age);
    }
    
}
