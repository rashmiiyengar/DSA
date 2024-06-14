package Recursion;


//Print x^n (stack height =n) //Y
//stack height -"stack height" usually refers to the depth of the 
//call stack at a given point during the execution of a program.

public class P8 {
    
    public static int calculatePower(int x,int n){

        if(n==0){
            return 1;//base case 1
        }
        if(x==0){
            return 0;//base case 3
        }

        int xPownm1= calculatePower(x, n-1);

        int xPown= x* xPownm1;
        return xPown;

    }
    public static void main(String[] args) {
        
        int x=2,n=5;

        int ans= calculatePower(x, n);
        System.out.println(ans);
    }
}
