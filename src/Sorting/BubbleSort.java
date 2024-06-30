package Sorting;

import java.util.Scanner;

public class BubbleSort {
    
    static boolean swapped;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int a[] = new int[n];

        int i,j, sum=0;
        for(i=0;i<n;i++){
            System.out.println("Enter value");
            a[i]= sc.nextInt();
            //sum+=a[i];
        }

        for(i=0;i<a.length;i++){
            swapped = false;
            for(j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j] =a[j+1];
                    a[j+1] =temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        //System.out.println(arr);
    }
}
