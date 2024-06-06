package Assignments.Week3.Assignment1;

import java.util.Scanner;

//write a program in java to find average of n numbers in an array

public class P3 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");

        int size = sc.nextInt();

        int arr[]= new int[size];

        int sum =0,i;

        for(i=0;i<size;i++){

            arr[i]=sc.nextInt();

            sum+=arr[i];
        }

        float average = (float)sum/size;

        System.out.println("The average of the array is " +average);

    }
}
