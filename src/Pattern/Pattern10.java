package Pattern;


//1
//13
//135
//1357

public class Pattern10 {
    public static void main(String[] args) {

        int i,j;
        for(i=1;i<=7;i+=2){

            for(j=1;j<=i;j+=2){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
