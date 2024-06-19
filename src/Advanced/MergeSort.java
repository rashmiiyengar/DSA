package Advanced;

public class MergeSort {
       //nlogn
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[] = new int [ei-si+1];

        int indx1= si;
        int indx2= mid+1;
        int x=0;

        //O(n)
        while(indx1<=mid && indx2 <=ei){

            if(arr[indx1]<=arr[indx2]){
                merged[x]=arr[indx1];
                x++;
                indx1++;

            }else{

                merged[x++]= arr[indx2++];
            }
        }
        //
        while(indx1<=mid){
            merged[x]=arr[indx1];
                x++;
                indx1++;
        }
        while(indx2<=ei){
            merged[x]=arr[indx2];
                x++;
                indx2++;
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    //O(logn)
    public static void divide(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
        int mid  =  si + (ei-si)/2;//si+ei/2
        divide(arr, si, mid);
        divide(arr, mid+1, ei);

        conquer(arr,si,mid,ei);

    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};

        int n = arr.length;
        divide(arr, 0, n-1);
        //Print

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); 
        }
    }
}