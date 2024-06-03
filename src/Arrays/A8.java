package Arrays;

import java.util.Scanner;



//Find minimum value in an array
public class A8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println(" enter the elemnt");
        for(int i=0;i<size;i++){
                System.out.println("enter the element");
              arr[i] =  sc.nextInt();
        }
        sc.close();

        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min+ "minimum value");
    }
}