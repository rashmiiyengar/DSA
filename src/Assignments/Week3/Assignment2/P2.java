package Assignments.Week3.Assignment2;

import java.util.Scanner;


//Write a program in java to enter two arrays of size n ,Create another array to contain squared values
//of all the elements of first array
public class P2 {
    
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");

        int size = sc.nextInt();

        int arr1[]= new int[size];

        int arr2[] = new int[size];

        int res[] = new int[size];

        int i;
        System.out.println("Enter elements of array1");
        for (i=0;i<size;i++){
            arr1[i] =sc.nextInt();
        }

        System.out.println("Enter elements of array2");
        for (i=0;i<size;i++){
            arr2[i] =sc.nextInt();
        }

        for(i=0;i<size;i++){

            res[i] = arr1[i] * arr2[i];
            System.out.println(res[i]);
        }
    }
}
