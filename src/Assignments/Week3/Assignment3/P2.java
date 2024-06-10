package Assignments.Week3.Assignment3;

import java.util.Scanner;


//merge two arrays
public class P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size of first array");
        int arr1Size = sc.nextInt();
        System.out.println("Enter the array size of two array");
        int arr2Size = sc.nextInt();

        int arr3Size = arr1Size + arr2Size;

        int arr1[] = new int[arr1Size];
        int arr2[] = new int[arr2Size];
        int arr3[] = new int[arr3Size];
        int i;

        System.out.println("Enter the elements of first array");
        for (i = 0; i < arr1Size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of second array");
        for (i = 0; i < arr2Size; i++) {
            arr2[i] = sc.nextInt();
        }

        for (i = 0; i < arr1Size; i++) {
            arr3[i] = arr1[i];

        }

        for (i = 0; i < arr2Size; i++) {
            arr3[arr1Size + i] = arr2[i];

        }

        for (i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }

}
