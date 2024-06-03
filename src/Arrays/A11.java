package Arrays;

import java.util.Scanner;

public class A11 {
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

                sec_max=max;
                max=a[i];
            }
            else if(a[i]>sec_max && a[i]!=max){

                sec_max=a[i];

            }
        }

    }
}
