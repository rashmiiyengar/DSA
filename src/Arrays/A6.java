package Arrays;

import java.util.Scanner;

//display numbers in array that are consecutive

//ip: [21,22,3,8,6,7], [3,8,9,10,20,22,21,22]
//op: [21,22]
public class A6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println(" enter the elemnt");
        for(int i=0;i<size;i++){
                System.out.println("enter the element");
              a[i] =  sc.nextInt();
        }
        for(int i=0;i<size-1;i++){

            if(a[i] ==a[i+1]-1){

                //a[i+1] -a[i] ==1
                System.out.println(a[i]+ "and " +a[i+1]+ "are consecutive numbers ");
            }
        }




    }
}
