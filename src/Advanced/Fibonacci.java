package Advanced;

import java.util.Scanner;

//Fibonacci without using recursion
public class Fibonacci {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in fibonacci series");
        int n= sc.nextInt();

        Fibonacci obj= new Fibonacci();
        int a=0,b=1;
        System.out.println("Fibonacci series" +n+ "terms");


        if(n>=1)
            System.out.println(a);
        if(n>=2)
            System.out.println(b);

        for(int i=2;i<n;i++){

            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
           
        }


    }
}
