package Basic;

public class Prime {
    public static void main(String[] args) {
        
        int n = 9,flag=0,i;

        if(n==1)
        { 
            System.out.println("neither prime nor composite");
            return;
            }

        for ( i=2;i<n;i++){

             if(n%i ==0){
                 
                 break;
         }  
        }
       // if(flag == 1)
       if(n==i) 
        System.out.println("pRIME NUMBER");
        else
        System.out.println("not prime number");
    }
}
