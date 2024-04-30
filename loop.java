import java.util.*;

public class loop {
    public static void main(String[] args) {
      /*  for(int number =0; number < 10; number= number +1){

             
            System.out.println(number);
        }
        for(int num=0; num<11; num++){
            System.out.print(num);
        }

        int i = 0;
        while(i<11){
            System.out.println(i);
            i++;
        }
int c =0;
        for(int b = 0; b<5; b++){
            c=c+b;
           


        }
        System.out.println(c);
    }
*/
      System.out.println("enter number");
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();

    for(int j =0; j<=i; j++){
        j =i+j;
    }
    System.out.println(i);


}


