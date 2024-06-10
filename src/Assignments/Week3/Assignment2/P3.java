package Assignments.Week3.Assignment2;

import java.util.Scanner;

public class P3 {
    

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int size = sc.nextInt();

        int arr[] = new int[size];
        int res[] = new int[size];
        int i;

        System.out.println("enetr the elements of array");
        for(i=0;i<size;i++){

            arr[i]= sc.nextInt();
        }

        for(i=0;i<size;i++)
        {
            if(arr[i]%2==0){
                res[i] = arr[i] *arr[i];
            }
            if(arr[i]%2!=0){
                res[i] = arr[i] *arr[i] * arr[i];
            }
          System.out.println(res[i]);
        }
    }
}
