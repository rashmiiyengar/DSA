package Pattern;


//1
//23
//345
//4567
public class Pattern12 {
    
    public static void main(String[] args) {
        
        int i,j,k;

        for( i=1;i<=4;i++){

            k=i;
            for(j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }

    }
}
