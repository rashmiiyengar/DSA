package Assignments.Arrays;

import java.util.Scanner;

//program to find average of n numbers using an array

public class A3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int size = sc.nextInt(); 

        int arr[] = new int[size];

        int i,sum=0;

        for(i=0;i<size;i++){

            System.out.println("Enter the number");
            arr[i]=sc.nextInt();

            sum+=arr[i];
        }

        int average =sum/size;

        System.out.println(""+average);




    }
}
