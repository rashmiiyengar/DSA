package Recursion;

//Fibonnacci series //Y
//The Fibonacci series is a sequence of numbers in which each number (after the first two) 
//is the sum of the two preceding ones. It typically starts with 0 and 1. The series goes:
// Eg: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

public class P7 {

    public static void printFib(int a, int b, int n){
        //a - second last tern
        //b - last tetrm 
        if(n==0){
            return;
        }
        int c= a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    public static void main(String[] args) {
        int a=0,b=1;
        int n=9;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, n-2);
    }
}
