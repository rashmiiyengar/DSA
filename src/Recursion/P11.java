package Recursion;

//Reverse using recursion
//Input=[10,20,30,40,50]
//Output=[50,40,30,20,10]
public class P11 {

    public static void main(String[] args) {
        
        int a[]= {10,20,30,40,50};
        reverse(a, 0, a.length-1);

        for(int num:a){
            System.out.print(num+ " ");
        }
       // System.out.println(Arrays.toString(a));
    }

   public static void reverse(int a[],int start,int end){

        if(start>=end)
            return;
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        reverse(a, start+1, end-1);

    }
}
