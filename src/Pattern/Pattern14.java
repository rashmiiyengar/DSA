package Pattern;


//1
//10
//101
//1010
//10101

//any number if done % 2 answer will be 1 or 0 
public class Pattern14 {
    

    public static void main(String[] args) {
        
            int i,j;
            for(i=1;i<=5;i++){

                for(j=1;j<=i;j++){
                    System.out.print(j%2);
                }
                System.out.println();
            }

    }
}
