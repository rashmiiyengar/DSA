package Advanced;

import java.util.Scanner;

public class SelectionSort {
    
    public static void printArray(int arr[]){
        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[]= new int[size];

        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        //Outer loop
        for(int i=0;i<size-1;i++){

            int smallest = i;

            for(int j=i+1;j<size;j++){

                if(arr[smallest]>arr[j]){
                    smallest =j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;

        }
        printArray(arr);
    }
}
