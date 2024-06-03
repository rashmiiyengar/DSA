package Arrays;

import java.util.Scanner;



//Sample input output
public class A5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int a[] = new int[size];

        int b[] = new int[size];

        int c[] = new int[size];

        int i;

        System.out.println("Input of 1st array");
        for(i=0;i<size;i++){
                System.out.println("enter the element");
              a[i] =  sc.nextInt();
        }

        System.out.println("Input of 2nd array");
        for(i=0;i<size;i++){
                System.out.println("enter the element");
              b[i] =  sc.nextInt();

        }
        for(i=0;i<size;i++){
            System.out.println("enter the element");
          
            c[i] =  a[i]+b[i];
    }
    

    System.out.println(c[i]);
    }
}
