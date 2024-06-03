package Basic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int ch = sc.nextLine().charAt(0);

        //if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        //System.out.println("vouwel");

    switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(ch+ "is vowel");
            break;
            default:
            System.out.println(ch+ "is consonent");
        }
    }
}
