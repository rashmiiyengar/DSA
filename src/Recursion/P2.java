package Recursion;

public class P2 {
    
    public void display(int n){

            if(n==10)
                return;
            display(n+1);
            System.out.println(n);
        }

    public static void main(String[] args) {
        
        P2 p= new P2();
        p.display(1);
        System.out.println("Done");

    }
}
