package Arrays;

import java.util.Scanner;

//Find second largest number without sorting

public class A10 {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int a[] = new int[size];
        int i;

        int max= Integer.MIN_VALUE;
        int sec_max= Integer.MIN_VALUE;

        for(i=0;i<size;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        for(i=0;i<size;i++){
            if(a[i]!=max){
                if(a[i]>sec_max){
                    sec_max=a[i];
                }
            }
        }

        System.out.println(sec_max+ " is the second largest number in the array");

    }
}
