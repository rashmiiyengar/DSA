package Assignments.Week3.Assignment2;

import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int i, index = -1;

        int max = Integer.MIN_VALUE;

        System.out.println("Enter the elements of array");
        for (i = 0; i < size; i++) {

            arr[i] = sc.nextInt();

        }

        sc.close();

        for (i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }

        }

        System.out.println("index of maximum value" +index);
    }
}
