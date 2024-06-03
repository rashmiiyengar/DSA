package Strings;

import java.util.Scanner;

//Swapping of two strings without temporary variable
//Input : String s ="Hello"
//String s1: "world"
//op: 
//String s="world"
//String s1: "hello"

public class S7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        System.out.println("enter  2nd string");
        String w=sc.nextLine();

        s=s+w;
        w= s.substring(0,s.length()-w.length());
        s=s.substring(w.length());
        System.out.println("Replaced string");
        System.out.println(s+ " " +w);
    }
}
