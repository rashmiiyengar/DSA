package Pattern;


//54321
//4321
//321
//21
//1

public class Pattern8 {
  

    
    public static void main(String[] args) {
        
        int i,j;
        for (i=5;i>=1;i--){

            for(j=i;j>=1;j--){
                System.out.print("*"+j+ " ");
            }
            System.out.println();
        }

    }
}
