package Assignments.Week3.Assignment3;

import java.util.Scanner;

//Program that exchanges the values of first half side elements with second half side elements of array.


public class P3 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("\nEnter Values in Array");
        int i;
        for(i=0;i<size;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }

        int k=size%2==1?size/2+1:size/2;
        System.out.println(k);
        
        for(i=0;i<size/2;i++)
        {
            int t=a[i];
            a[i]=a[k];
            a[k]=t;
            k++;
        }
        System.out.println();
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
