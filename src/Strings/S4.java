package Strings;

import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int l = s.length();

        int i;
        String an=" ";
        for(i=0;i<l;i++){
            System.out.println(s.charAt(l-1-i));

            char ch= s.charAt(i);

            an = ch+an;
           
        }
        System.out.println(an);
      
    }
}
