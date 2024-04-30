public class reversepyramid {
    public static void main(String[] args) {
        int k= 4;

       for(int i=k; i>=1; i--){
        for(int j=0 ; j<i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
