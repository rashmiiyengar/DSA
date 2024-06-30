package Leetcode;
//Problem 7
//Given a signed 32-bit integer x, return x with its digits reversed. 
//If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

public class ReverseInteger {
    public static int reverse(int x) {
        int sign = x<0 ? -1 : 1;
        x=Math.abs(x);
        int reverse=0;

        while(x>0){
            int temp = x%10;
            //System.out.println(temp);
            if(reverse > (Integer.MAX_VALUE-temp ) / 10 ) {
            return 0;
            }
          
            reverse = reverse*10+temp;
            x=x/10;
        }
            return  sign * reverse;
    }

    public static void main(String[] args) {
        
        System.out.println(reverse(1234567));
    }
}
