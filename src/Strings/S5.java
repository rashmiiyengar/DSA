package Strings;

import java.util.Scanner;

//palindrome
public class S5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int l = s.length();
        int i;
        String an=" ";
        for(i=0;i<l;i++){
            char ch= s.charAt(i);
            an = ch+an;           
        }
        System.out.println(an);
        if(an.equals(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
