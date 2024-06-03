package Pattern;


//    1
//   121
//  12321
// 1234321
//  12321
//   121
//    1

public class Pattern11 {
    
    public static void main(String[] args) {

        int i,j;

        for(i=1;i<=4;i++){

            for(int x=i;x<=3;x++){
                System.out.print(" ");
            }
           
            for(j=1;j<=i;j++){
                System.out.print(j);

            }
            for(j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
           
        
        }
        for( i=3;i>=1;i--){

            for(int s =i;s<=3;s++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        


    }
}
