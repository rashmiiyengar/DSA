package Arrays;

import java.util.Scanner;

public class A2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int a[] = new int[n];

        int i,sum=0;
        for(i=0;i<n;i++){
            System.out.println("Enter value");
            a[i]= sc.nextInt();
            sum+=a[i];
        }

        
        //System.out.println(a[2]);
        
        // for(i=0;i<a.length;i++){
        //     sum+=a[i];
            
        // }
        System.out.println(sum);
    }
}
