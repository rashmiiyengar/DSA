package Assignments.Assignment4;


//    1
//   13
//  135
// 1357

public class P2 {
    

    public static void main(String[] args) {
        

        int i,j;
        int rows=4;
        for(i=1;i<=4;i++){


            for(int k=1;k<=rows-i;k++){
                System.out.print(" ");
            }
            for( j=1;j<=i;j+=2)
                {
                    System.out.print(j);
                }   
                System.out.println();     
            }
    }
}
