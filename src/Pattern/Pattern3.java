package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        
            int rows=8;
            for(int i=1;i<=rows;i++){

                for(int x=1;x<=rows-i;x++){
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }

                System.out.println();

            }
    }
}
