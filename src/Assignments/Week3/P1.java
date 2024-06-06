package Assignments.Week3;

import java.util.Scanner;

//Write a program in java to enter an array of size n .display these elements in reverse order.

public class P1 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();

        int arr[] = new int[size];

        int i;

        for(i=0;i<size;i++){

            arr[i]= sc.nextInt();

        }

        for(i=size-1;i>=0;i--){
            System.out.print(arr[i]+ "Reversed array");
        }

    }
}
