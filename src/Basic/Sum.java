package Basic;

public class Sum {

    public static void main(String[] args) {
        

        int x= 123, sum=0;
        while( x!=0){

            int rem = x% 10;
            sum = sum+rem;
            x=x/10;
        }
        System.out.println(sum);

        char ch = 2;
        double d= 'a';
        System.out.println(ch);

    }
}
