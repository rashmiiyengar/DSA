package Basic;

public class Ternary {
    public static void main(String[] args) {
        
            // int a=5,b=15;
            // int big= a>b?a:b;
            // System.out.println(big);
            
            int a=5,b=5,c=2;

            int big= (a>=b && a>=c) ? a: (b>=a&& b>=c)?b :c;
            System.out.println(big);

    }
}
