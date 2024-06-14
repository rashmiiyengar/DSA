package Recursion;

import java.util.Scanner;

//Recursion fibonacci //Class
public class P12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x= sc.nextInt();
        P12 p= new P12();

        int ans =p.fibonacci(x);
        System.out.println(ans+ "Result");
        for(int i=0;i<=x;i++){
            System.out.print(p.fibonacci(i));
        }
    }

    public int fibonacci(int n){

        if(n<=1){
            return n;
        }
        else
        {
            return fibonacci(n-1)+ fibonacci(n-2);
        }
        
    }
}
