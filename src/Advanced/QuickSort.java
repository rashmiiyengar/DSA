package Advanced;

public class QuickSort { 

    //Time complexity
    //Worst case - Worst case occurs when pivot is always the smallest or the largest element
    //O(n^n)

    //Average case - O(nlogn) 
    public static void quickSort(int arr[],int low,int high){
        if(low<high){

            int pivotx= partition(arr,low,high);
            quickSort(arr, low, pivotx-1);
            quickSort(arr, pivotx+1, high);
        }
    }

    public static int partition(int arr[],int low,int high){
        //In this program we are choosing last element of the array as out pivot
        int pivot = arr[high];

        int i= low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap

                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp= arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot index
    }

    public static void main(String[] args) {
        
        int arr[]= {6,3,9,5,2,8};

        int n = arr.length;
        quickSort(arr, 0, n-1);
        //print

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
