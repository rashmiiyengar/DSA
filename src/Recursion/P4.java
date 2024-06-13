package Recursion;

import java.util.Scanner;

//Armstrong number not using  using recursion

public class P4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int rem,sum=0,y=n;

        while(n!=0){
            rem= n%10;
            int cube= rem*rem*rem;
            sum=sum+cube;
            n=n/10;
        }

        if(sum==y)
            System.out.println(y+ " is Armstrong Number ");
        else
            System.out.println("Not armstrong number");
    }
    
}
