package Recursion;

//factorial of n numbers with recurson //Y

public class P6 {

    public  static int calculateFactorial(int n){

        if( n==1 || n==0 )
         {
                return 1;
         }
       int factorial_nm1= calculateFactorial(n-1);
       int fact_n= n* factorial_nm1;
       return fact_n;

    }
    public static void main(String[] args) {
        
       int ans= calculateFactorial(5);
       System.out.println(ans);
    }
    

}
