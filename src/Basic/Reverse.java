package Basic;

public class Reverse {
    

    public static void main(String[] args) {
        
            //Input 123
            //Output 321
            //1. Extract last digit
            //2. add last digit in temp variable
            //3. remove last digit from original number

            long x= 1234567892, rev=0;
            while(x!=0){

                long temp= x % 10 ;

                rev = rev * 10 + temp;

                x= x/10;

            }
            System.out.println(rev);

    }
}
