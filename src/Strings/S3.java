package Strings;

import java.util.Scanner;

public class S3 {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("eneter string");
        String s=sc.nextLine();
        int l = s.length();

        int i;

        for(i=l-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
