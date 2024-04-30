package a;

public class infiniteloop {
    public static void infinite(){
        do{
            System.out.println(" this is infinite loop");
        }while(true);
    }
    public static void main(String[] args) {
        infinite();
    }
}
