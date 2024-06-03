package Strings;

import java.lang.reflect.Array;
import java.util.Scanner;

//Anagram 
//Length same
//Charectors same
//Frequency of charectors also same
//order does not matter

//ip1 aaabb
//ip2 babaa 

//total charectors 0- 255 

public class S8 {

    static int NO_OF_CHARS = 256;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");

        String s1 = sc.nextLine();
        System.out.println("Enter second string");

        String s2 = sc.nextLine();
        char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();

        int count1[] = new int[NO_OF_CHARS];
        int count2[] = new int[NO_OF_CHARS];

        if (str1.length != str2.length) {

            System.out.println("Not an anagram");
            return;
        }

        int i;

        for (i = 0; i < str1.length; i++) {

            count1[str1[i]]++;
            count2[str2[i]]++;

            // char to int implicitly
            // char 2byte -> int 4 byte 2 byte can store in 4 byte

        }

        // compare count arrays

        for (i = 0; i < NO_OF_CHARS; i++) {

            if (count1[i] != count2[i]) {
                break;
            }
        }

        if (i == NO_OF_CHARS)
            System.out.println("Anagram");
            
        else
            System.out.println("not anagram");

        System.err.println(count1);

    }
}
