package Arrays;

import java.util.Scanner;

//maximum number in array

public class A7 {
    
    public static void main(String[] args) {    

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int max=0;

        System.out.println(" eneter the elemnt");
        for(int i=0;i<size;i++){
                System.out.println("enter the element");
              arr[i] =  sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max+ "highest value");
    }
}

