package Problems;

public class DuckNumber {
    

    public static void main(String[] args) {
        
        int x= 100402;

        while(x!=0){

            int rem = x%10;

            if(rem==0)
                break; //terminates the loop
            x=x/10;
        }
        if(x==0)
            System.out.println("is not a Duck number");
        else
            System.out.println("Duck Number");



    }
}
