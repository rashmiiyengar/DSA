package Recursion;

import java.util.Scanner;

//palindrome using recursion
public class P3 {
   
    public static boolean isPalindrome(String str){

        if(str.length()<=1)
            return true;
        if(str.charAt(0)!=str.charAt(str.length()-1))
            return false;

        boolean res=isPalindrome(str.substring(1, str.length()-1));
        return res;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();

        boolean result =isPalindrome(str);
        if(result==true)
        System.out.println("Is palindrome");
        else
        System.out.println("Is not palindrome");
    }
}
