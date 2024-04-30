import java.util.*;

public class pyramid {
    public static void main(String[] args) {
        for(int i = 0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int k = sc.nextInt();
        for(int m=0; m<k; m++){
            for(int n=0; n<=m; n++){
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
}
