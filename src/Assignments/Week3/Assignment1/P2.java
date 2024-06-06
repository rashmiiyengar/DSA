package Assignments.Week3.Assignment1;

import java.util.Scanner;


//Enter the sum of all odd and even elements in an array
public class P2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");

        int size = sc.nextInt();

        int arr[]= new int[size];
        int sumOdd=0,sumEven=0;

        System.out.println("Enter the arry elements");
         for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();

                if(arr[i]%2==0){
                    sumEven+=+arr[i];
                }
                if(arr[i]%2!=0){
                    sumOdd+=+arr[i];
                }
        }

        System.out.println("sum of odd numbers" +sumOdd);
        System.out.println("Sum of even numbers" +sumEven);
    }
}
