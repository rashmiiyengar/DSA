package Basic;

public class Factorial {
    
    public static void main(String[] args) {
        

        int number = 6;
        int factorial = 1;

        for ( int i=number; i>=1;i--){
                factorial=factorial*i;

        }
        System.out.println(factorial);
    }
}
