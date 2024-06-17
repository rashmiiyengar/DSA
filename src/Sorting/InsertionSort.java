package Sorting;

public class InsertionSort {
    
    public static void main(String[] args) {
        
        int a[]={23,1,10,5,2};

        int i,j;
        for(i=1;i<a.length;i++){
            int key =a[i];
            j=i-1;
            while(j>=0 && a[j]>key){

                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }

        for(i=0;i<a.length;i++){
            System.out.println(a[i]+ " ");
        }
    }
}
