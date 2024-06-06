package Assignments.Week3.Assignment1;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int size = sc.nextInt();
        int arr[]=new int[size];
        int i,sum=0;

        for(i=0;i<size;i++){

            arr[i]=sc.nextInt();
            if(i%2!=0){
                sum+=arr[i];
            }
        }

        System.out.println("Sum of all odd indexes in the array is  "+sum);
    }
}
