package Problems;

import java.util.Scanner;

//write a program in java to sum of  positive and negetive nos froma list of numbers entered by user
//list will terminate if 0 entered

public class P2 {

    public static void main(String[] args) {
        
        int sump=0,sumn=0,countp=0,countn=0;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int x = sc.nextInt();
           
            
            if(x==0)
                break;
            else if(x>0){
                sump+=x;
                countp++;
            }
            else
            {
                sumn+=x;
                countn++;
            }
                
            
           
        }
        System.out.println("sum of positive numbers:" +sump);
            System.out.println("sum of positive numbers:" +sumn);
            System.out.println("count positive" +countp);
            System.out.println("count negetive" +countn);
    }
}
