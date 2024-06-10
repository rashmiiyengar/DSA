package Assignments.Week3.Assignment3;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int i, index = -1;

        int min = Integer.MAX_VALUE, sec_min = Integer.MAX_VALUE;

        System.out.println("Enter the elements of array");
        for (i = 0; i < size; i++) {

            arr[i] = sc.nextInt();

        }

        sc.close();

        // [1,2,3,4,5,6]
        for (i = 0; i < size; i++) {
            if (arr[i] < min) {
                sec_min = min;
                min = arr[i];
            } else if (arr[i] < sec_min && arr[i] != min) {
                sec_min = arr[i];
                index = i;
            }

        }

        System.out.println(sec_min);
    }
}
