package Recursion;


//Print sum of n natural numbers with recursion

public class P5 {

    public static void printSum(int i,int n, int sum){

        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        System.out.println(i);
        printSum(i+1, n, sum);
       
    }

    public static void main(String[] args) {
        
        P5.printSum(1, 9, 0);
    }
}
