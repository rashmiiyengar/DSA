package Assignments.Week3.Assignment3;

import java.util.Scanner;

//program to check if all ements are equal
public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("eneter values of array");
        int i;

        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < size; i++) {
            if (arr[i] != arr[0]) {
                break;
            }
        }

        if (i == size)
            System.out.println("elements are equal");
        else
            System.out.println("elements are not equal");
    }
}
