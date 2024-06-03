package Strings;

import java.util.Scanner;


//other solution for palindrome
public class S6 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String s=sc.nextLine();
    int l = s.length();
    int i;

    int j=l-1;

    for(i=0;i<j;i++){
        char ch= s.charAt(i);
        char ch1= s.charAt(j);

       if(ch!=ch1)     
            break;
            j--;
    }
    System.out.println();
    if(i>=j)
        System.out.println("Palindrome");
    else
        System.out.println("Not a palindrome");
}
}
