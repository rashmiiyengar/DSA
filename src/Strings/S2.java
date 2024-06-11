package Strings;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("eneter string");
        String s=sc.nextLine();
        int l = s.length();
        int i;

        for(i=0;i<l;i++){
            System.out.println(s.charAt(i));
        }
        
    }
}
