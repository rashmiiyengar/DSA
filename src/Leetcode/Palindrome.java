package Leetcode;

//Leetcode 9 
//Given an integer x, return true if x is a palindrome, and false otherwise.
//Overflow scenario handled

public class Palindrome {
    
    public static boolean isPalindrome(int x){
        int temp=x;
        int s = x<0 ? -1:1;
        int reverse =0;

        while(x>0){
            int rem = x%10;

            if(reverse> (Integer.MAX_VALUE-rem)/10){
                return false;
            }
            reverse = reverse*10 +rem;
            x=x/10;
        }

        return s*reverse == temp ? true:false;
    }

    public static void main(String[] args) {
        int x= 121;
       Boolean ans = isPalindrome(x);
       System.out.println(ans);
    }
}
