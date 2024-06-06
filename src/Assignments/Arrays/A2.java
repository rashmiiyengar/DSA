package Assignments.Arrays;

import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of array");

        int size = sc.nextInt();

        int arr[] = new int[size];

        int i,sumOdd=0,sumEven=0;

        for(i=0;i<size;i++){

            arr[i]=sc.nextInt();

            if(arr[i]%2 != 0){
                sumOdd+=arr[i];
            }
            if(arr[i]%2 == 0){
                sumEven+=arr[i];
            }

        }
        System.out.println("Sum of odd digits "+sumOdd);
        System.out.println("Sum of even digits "+sumEven);
    }
}
