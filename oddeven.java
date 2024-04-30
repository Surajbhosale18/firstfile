import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        
        if(number%2==0){
            System.out.println("this is even number");
        }else{
            System.out.println("this is odd number");
        }
    }
}
