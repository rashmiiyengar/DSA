package Arrays;

import java.util.Scanner;

public class A9 {
    
    //write 

    //if n=6 and input arrays are 
    //a[] = {3,2,4,6,1,8}
    //o/p
    //b[] ={11,3,10,10,3,11}

    public static void main(String[] args) {
        

        //j=n-1 last element of array
        //i=0 first element of array

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int a[] = new int[size];
        int b[] = new int[size];

        System.out.println(" enter the elemnt");
        for(int i=0;i<size;i++){
                
              a[i] =  sc.nextInt();
        }
        sc.close();
        int i,j;

        System.out.println("output array");
        for(i=0,j=size-1;i<size;i++,j--){
            b[i]= a[i]+b[j];
            
          System.out.println(  +b[i]);
        }



        // for(i=0,i<size;i++,j--){
        //     b[i]= a[i]+a[n-1-i]
        // }




    }
}
