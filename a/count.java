package a;
 import java.util.*;

 public class count {
    public static void main(String[] args) {
        int postive =0;
        int negative =0;
        int zero =0;

        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();

        if(a<0){
            postive++;
            
        }else if(a>0){
            negative++;
        }else{
            zero++;
        }

        System.out.println(postive);
        System.out.println(negative);
        System.out.println(zero);
    }
 
    
 }