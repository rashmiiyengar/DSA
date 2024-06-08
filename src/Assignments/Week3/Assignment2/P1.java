package Assignments.Week3.Assignment2;

import java.util.Scanner;

public class P1 {
    

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size=  sc.nextInt();

        int arr1[] = new int[size];
        int arr2[] = new int[size];

        System.out.println("eneter the elements of array");
        for(int i=0;i<size;i++){

            arr1[i]=sc.nextInt();


        }

        for(int i=0;i<size;i++){
            arr2[i]=  arr1[i] * arr1[i];
            System.out.println(arr2[i]);
        }

        

    }
}
