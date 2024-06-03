package Arrays;

import java.util.Scanner;

public class A3 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        int a[] = new int[n];

        int i, sum=0;
        for(i=0;i<n;i++){
            System.out.println("Enter value");
            a[i]= sc.nextInt();
            //sum+=a[i];
        }
        for(i=n-1;i>=0;i--){
            System.out.print(a[i]+ " ");
        }
    }
}
