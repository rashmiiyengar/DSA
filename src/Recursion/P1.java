package Recursion;

//Time complexity O(n)
//Space Complexity O(n)
public class P1 {

    public void display(int x){

        if(x>5)
            return;
        else   
            System.out.println(x);
            display(x+1);
    }

    public static void main(String[] args) {
        
        P1 p= new P1();
        p.display(1);

    }
}
