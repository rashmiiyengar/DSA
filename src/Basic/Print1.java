package Basic;

public class Print1 {
    public static void main(String[] args) {

        int i,j;
        int k=1;
        int rows=5;
        for(i=1;i<=rows;i++){

            for(int x=1;x<=rows-i;x++){
                System.out.print(" ");
            }
           
            for(j=i;j<=2*i-1;j++){
                System.out.print(j);
                //k++;

            }
            System.out.println();
        
        }
    
        
    }
}
