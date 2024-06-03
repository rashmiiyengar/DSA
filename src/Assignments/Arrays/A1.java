package Assignments.Arrays;

import java.util.Scanner;

public class A1 {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size ");

        int size= sc.nextInt();
        int arr[] = new int[size];


        for(int i=0;i<size;i++){
            System.out.println("Enter the number ");
            arr[i]=sc.nextInt();
        }

        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }


    
    }
}
