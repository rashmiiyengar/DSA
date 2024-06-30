package Pattern;

public class Pattern4 {

    public static void main(String[] args) {
        
        int i,j;
        int k=1;
        for(i=1;i<=4;i++){
    
            for(j=1;j<=i;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
}
